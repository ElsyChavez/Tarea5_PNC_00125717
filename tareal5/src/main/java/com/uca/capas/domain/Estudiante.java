package com.uca.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(schema = "public", name ="estudiante")
public class Estudiante {
	
	@Id
	@Column(name = "c_usuario")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer codigoUsuario;
	
	@Column(name = "nombre")
	@Size(max = 50, message = "El nombre no debe tener mas de 50 caracteres")
	@NotEmpty(message ="Este campo no puede estar vacio.")
	private String Nombre;
	
	@Column(name = "apellido")
	@Size(max = 50, message = "El apellido no debe tener mas de 50 caracteres")
	@NotEmpty(message ="Este campo no puede estar vacio.")
	private String Apellido;
	
	@Column(name = "carne")
	@Size(min = 8, max = 8, message = "El carne debe tener 8 digitos")
	@NotEmpty(message ="Este campo no puede estar vacio.")
	private String Carne;
	
	@Column(name = "carrera")
	@Size(max = 100, message = "La carrera no debe tener mas de 100 caracteres")
	@NotEmpty(message ="Este campo no puede estar vacio.")
	private String Carrera;
	
	public Estudiante() {
		
	}

	public Integer getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(Integer codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getCarne() {
		return Carne;
	}

	public void setCarne(String carne) {
		Carne = carne;
	}

	public String getCarrera() {
		return Carrera;
	}

	public void setCarrera(String carrera) {
		Carrera = carrera;
	}
	
	
	
}
