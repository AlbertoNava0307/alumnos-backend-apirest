package com.example.alumnos.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.alumnos.backend.apirest.models.entity.Alumno;

public interface IAlumnoDao extends CrudRepository<Alumno, Long> {

}
