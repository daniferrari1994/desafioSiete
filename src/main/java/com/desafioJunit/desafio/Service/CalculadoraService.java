package com.desafioJunit.desafio.Service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {
    public int suma(int a, int b){
        return a+b;
    }

    public int resta(int a, int b){
        return a-b;
    }

    public int multiplicacion(int a, int b){
        return a*b;
    }
}
