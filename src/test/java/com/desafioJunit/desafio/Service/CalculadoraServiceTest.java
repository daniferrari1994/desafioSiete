package com.desafioJunit.desafio.Service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class CalculadoraServiceTest {

    @Autowired
    private CalculadoraService calculadoraService;

    @BeforeEach
    void setUp() {
    }

    @Test
    void testSuma() {
        int a = 3;
        int b = 10;
        int result = calculadoraService.suma(a,b);

        assertEquals(13, result);
    }

    @Test
    void resta() {
        int a=5;
        int b=3;
        int result = calculadoraService.resta(a,b);
        assertEquals(2,result);
    }

    @Test
    void multiplicacion() {
        int a= 3;
        int b=5;
        int result = calculadoraService.multiplicacion(a,b);
        assertEquals(15,result);
    }
}