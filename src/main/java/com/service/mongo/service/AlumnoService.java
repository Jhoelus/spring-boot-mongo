package com.service.mongo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.service.mongo.dao.entity.EAlumnos;
import com.service.mongo.dao.repository.IAlumnoRepository;

@Service
public class AlumnoService {
	
	@Autowired
	IAlumnoRepository alumnoRepository;
	
	Pageable pageable;
	
	public Optional<EAlumnos> findById(String id) {
		return alumnoRepository.findById(id);
	}
	
	public List<EAlumnos> findByCurso(String curso) {
		return alumnoRepository.findByCurso(curso);
	}
	
	public List<EAlumnos> findAll(int pag, int documentos){
		pageable = PageRequest.of(pag, documentos);
		return alumnoRepository.findAll(pageable).toList();
	}
}
