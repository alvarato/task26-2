package com.pacoteck.springboot.app.service;

import java.util.List;

import com.pacoteck.springboot.app.dto.Proyecto;


public interface IProyecto {

	public void create(Proyecto entity);
	public void update(Proyecto entity);
	public void deleteById(String id);
	public List<Proyecto> findAll();
}
