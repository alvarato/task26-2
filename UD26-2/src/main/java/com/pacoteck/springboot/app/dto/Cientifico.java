package com.pacoteck.springboot.app.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "cientificos")
public class Cientifico {

	@Id
	private String dni;
	
	@Column(name="nomApels")
	private String nomApels;
	
	
	@OneToMany(mappedBy = "cientifico",cascade = CascadeType.ALL)
	private List<Asignado> asignado;
	
	public Cientifico() {}

	public Cientifico(String dni, String nomApels, List<Asignado> asignado) {
		super();
		this.dni = dni;
		this.nomApels = nomApels;
		this.asignado = asignado;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNomApels() {
		return nomApels;
	}

	public void setNomApels(String nomApels) {
		this.nomApels = nomApels;
	}
	@JsonIgnore
	public List<Asignado> getAsignado() {
		return asignado;
	}

	public void setAsignado(List<Asignado> asignado) {
		this.asignado = asignado;
	}
	
	
}
