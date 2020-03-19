package com.service.mongo.dao.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "alumnos")
public class EAlumnos {
	
	@Id
	private String _id;
	
	@Field("materia")
	private String mater_ia;
	
	private String curso;
	
	@DBRef
	private EAlumno alumno;
	
	public EAlumno getAlumno() {
		return alumno;
	}

	public void setAlumno(EAlumno alumno) {
		this.alumno = alumno;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getMater_ia() {
		return mater_ia;
	}

	public void setMater_ia(String mater_ia) {
		this.mater_ia = mater_ia;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
}
