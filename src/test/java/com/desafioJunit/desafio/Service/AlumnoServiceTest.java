package com.desafioJunit.desafio.Service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class AlumnoServiceTest {

    //@Autowired
    //private AlumnoService alumnoService;

    @Autowired
    private MockMvc mock;

    @MockBean
    private AlumnoService service;

    @BeforeEach
    void setUp() {
    }

    @Test
    void nombreCompleto() throws Exception {

        String nombre = "teniente";
        String apellido = "dan";
        String completo = service.nombreCompleto(nombre, apellido);
        System.out.println(completo);
        assertEquals("teniente dan", completo);
        this.mock.perform(get("/")).andDo(print()).andExpect(status().isOk()).andExpect(content().string(containsString(completo)));
    }
}