package com.desafioJunit.desafio.Service;

import org.springframework.stereotype.Service;

@Service
public class AlumnoService {
    public String nombreCompleto(String nombre, String apellido){
        return nombre + " " + apellido;
    }

    public String bienvenida(){ return "Bienvenido a los alumnos ";}
}
