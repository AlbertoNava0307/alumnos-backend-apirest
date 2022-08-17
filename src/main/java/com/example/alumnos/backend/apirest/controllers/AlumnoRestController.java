package com.example.alumnos.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.alumnos.backend.apirest.models.entity.Alumno;
import com.example.alumnos.backend.apirest.models.services.IAlumnoService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/alumnos")
public class AlumnoRestController {

	@Autowired
	IAlumnoService alumnoService;
	
	//obtiene una lista de todos los alumnos
	//@GetMapping("/alumnos")
	@GetMapping
	public List<Alumno> getAlumnos(){
		return alumnoService.findAll();
	}
	
	//guarda un nuevo alumno
	//@PostMapping("/alumnos")
	@PostMapping
	public Alumno save(@RequestBody Alumno alumno){
		return alumnoService.save(alumno);
	}
	
	//elimina un alumno
	@DeleteMapping("/{id}")
	public boolean delete(@PathVariable Long id){
		alumnoService.delete(id);
		return true;
	}
}
