package com.example.alumnos.backend.apirest.models.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.alumnos.backend.apirest.models.entity.Admin;

public interface IAdminDao extends CrudRepository<Admin, Long>{

	Optional<Admin> findByUsuarioAndPassword(String usuario, String password);
}
