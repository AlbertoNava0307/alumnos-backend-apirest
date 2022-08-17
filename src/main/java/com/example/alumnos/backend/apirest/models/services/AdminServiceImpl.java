package com.example.alumnos.backend.apirest.models.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.alumnos.backend.apirest.models.dao.IAdminDao;
import com.example.alumnos.backend.apirest.models.entity.Admin;

@Service
public class AdminServiceImpl implements IAdminService {
	
	@Autowired
	IAdminDao adminDao;

	@Override
	public Optional<Admin> findByUsuarioAndPassword(String usuario, String password) {
		return adminDao.findByUsuarioAndPassword(usuario, password);
	}

}
