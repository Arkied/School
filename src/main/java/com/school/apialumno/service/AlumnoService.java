package com.school.apialumno.service;

import com.school.apialumno.entity.Alumno;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface AlumnoService {
    public Iterable<Alumno> findAll();
    public Page<Alumno> findAll(Pageable pageable);
    public Optional<Alumno> findById(Long id);
    public Alumno save(Alumno alumno);
    public void deleteById(Long id);
}
