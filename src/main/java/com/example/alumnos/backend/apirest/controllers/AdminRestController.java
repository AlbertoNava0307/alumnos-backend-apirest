package com.example.alumnos.backend.apirest.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.alumnos.backend.apirest.models.entity.Admin;
import com.example.alumnos.backend.apirest.models.services.IAdminService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/admin")
public class AdminRestController {
	
	@Autowired
	IAdminService adminService;
	
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody Admin admin){
		Map <String, Object> response = new HashMap<>();
		if(adminService.findByUsuarioAndPassword(admin.getUsuario(), admin.getPassword()).isPresent()) {
			response.put("token", "token_ejemplo_123_abc");
			return new ResponseEntity<Map <String, Object>>(response, HttpStatus.OK);
		}
		response.put("error", "Usuario o contraseña incorrectos");
		return new ResponseEntity<Map <String, Object>>(response, HttpStatus.UNAUTHORIZED);
	}
}
