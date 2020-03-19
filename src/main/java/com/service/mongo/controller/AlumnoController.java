package com.service.mongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.mongo.dao.entity.EAlumnos;
import com.service.mongo.service.AlumnoService;

@RestController
@RequestMapping(value = "/api/alumnos")
public class AlumnoController {
	
	@Autowired
	AlumnoService alumnoService;
	
	@GetMapping(value = {"","/"})
	public String getStatus() {
		return "server up...!!!";
	}
	
	@GetMapping("/{id}")
	public EAlumnos getAlumboById(@PathVariable("id") String id) {
		return alumnoService.findById(id).orElse(null);
	}
	
	@GetMapping("/curso/{curso}")
	public List<EAlumnos> getAlumboByCurso(@PathVariable("curso") String curso) {
		return alumnoService.findByCurso(curso);
	}
	
	@GetMapping("/pagina/{pag}/documentos/{doc}")
	public List<EAlumnos> getfindAll(@PathVariable("pag") int pag, @PathVariable("doc") int doc) {
		return alumnoService.findAll(pag, doc);
	}
}
