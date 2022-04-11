package com.desafioJunit.desafio.controller;

import com.desafioJunit.desafio.Service.AlumnoService;
import com.desafioJunit.desafio.entity.Alumno;
import com.desafioJunit.desafio.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apiAlumnos")
public class AlumnoController {
    @Autowired
    private AlumnoRepository alumnoRepository;

    private AlumnoService service;

    public AlumnoController(AlumnoService service){ this.service = service;}

    @GetMapping("/alumno")
    public @ResponseBody String bienvenida(){return service.bienvenida();}

    @GetMapping("/")
    public List<Alumno> todos(){
        return (List<Alumno>) alumnoRepository.findAll();
    }

    @PostMapping("/{id}")
    Alumno postAlumno(@RequestBody Alumno alumno){
        return alumnoRepository.save(alumno);
    }

    @PutMapping("/{id}")
    Alumno putAlumno(@RequestBody Alumno alumno){
        alumnoRepository.delete(alumno);
        return alumnoRepository.save(alumno);
    }
}
