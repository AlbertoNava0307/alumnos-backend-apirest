package com.example.alumnos.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.alumnos.backend.apirest.models.dao.IAlumnoDao;
import com.example.alumnos.backend.apirest.models.entity.Alumno;

@Service
public class AlumnoServiceImpl implements IAlumnoService {
	
	@Autowired
	private IAlumnoDao alumnoDao;

	@Override
	@Transactional(readOnly = true)
	public List<Alumno> findAll() {
		return (List<Alumno>) alumnoDao.findAll();
	}

	@Override
	@Transactional
	public Alumno save(Alumno alumno) {
		return alumnoDao.save(alumno);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		alumnoDao.deleteById(id);
	}

}
