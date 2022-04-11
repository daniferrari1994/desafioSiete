package com.desafioJunit.desafio.repository;

import com.desafioJunit.desafio.entity.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepository  extends JpaRepository<Alumno, Long> {
}
