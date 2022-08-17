package com.example.alumnos.backend.apirest.models.services;

import java.util.List;

import com.example.alumnos.backend.apirest.models.entity.Alumno;

public interface IAlumnoService {

	public List<Alumno> findAll();
	
	public Alumno save(Alumno alumno);
	
	public void delete(Long id);
	
}
