package com.service.mongo.dao.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.service.mongo.dao.entity.EAlumnos;

public interface IAlumnoRepository extends PagingAndSortingRepository<EAlumnos, String>{
	
	public List<EAlumnos> findByCurso(String curso);
}
