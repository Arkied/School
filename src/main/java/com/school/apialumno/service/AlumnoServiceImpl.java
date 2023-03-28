package com.school.apialumno.service;

import com.school.apialumno.entity.Alumno;
import com.school.apialumno.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class AlumnoServiceImpl implements AlumnoService {

    @Autowired
    private AlumnoRepository alumnoRepository;

    @Override
    @Transactional(readOnly = true)
    public Iterable<Alumno> findAll() {
        return alumnoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Alumno> findAll(Pageable pageable) {
        return alumnoRepository.findAll(pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Alumno> findById(Long id) {
        return alumnoRepository.findById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Alumno save(Alumno alumno) {
        return alumnoRepository.save(alumno);
    }

    @Override
    @Transactional(readOnly = true)
    public void deleteById(Long id) {
        alumnoRepository.deleteById(id);
    }
}
