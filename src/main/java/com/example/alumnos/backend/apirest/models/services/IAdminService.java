package com.example.alumnos.backend.apirest.models.services;

import java.util.Optional;

import com.example.alumnos.backend.apirest.models.entity.Admin;

public interface IAdminService {

	public Optional<Admin> findByUsuarioAndPassword(String usuario, String password);
}
