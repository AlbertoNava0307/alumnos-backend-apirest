package com.example.alumnos.backend.apirest.models.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="alumnos")
public class Alumno {
	
	public static final String GRADO_ESTUDIOS_SECUNDARIA = "S";
	public static final String GRADO_ESTUDIOS_BACHILLERATO = "B";
	public static final String GRADO_ESTUDIOS_LICENCIATURA = "L";
	public static final String GRADO_ESTUDIOS_POSGRADO = "P";
	public static final String GRADO_ESTUDIOS_MAESTRIA = "M";
	public static final String GRADO_ESTUDIOS_DOCTORADO = "D";

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator = "alumno_generator")
	@SequenceGenerator(initialValue = 6, name = "alumno_generator")
	@Column(columnDefinition = "serial")
	private Long id;
	
	@Column(name = "nombre", nullable = false)
	private String nombre;
	
	@Column(name = "apellido_paterno", nullable = false)
	private String apellidoPaterno;
	
	@Column(name = "apellido_materno", nullable = false)
	private String apellidoMaterno;
	
	@Column(name = "fecha_nacimiento", nullable = false)
	private Timestamp fechaNacimiento;
	
	@Column(name = "sexo", length=1 , nullable = false)
	private String sexo;
	
	@Column(name = "grado_estudios_actual", length=1 , nullable = false)
	private String gradoEstudiosActual;
	
	@Column(name = "email", nullable = false)
	private String email;
	
	@Column(name = "telefono", nullable = false)
	private String telefono;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public Timestamp getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Timestamp fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getGradoEstudiosActual() {
		return gradoEstudiosActual;
	}

	public void setGradoEstudiosActual(String gradoEstudiosActual) {
		this.gradoEstudiosActual = gradoEstudiosActual;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
}
