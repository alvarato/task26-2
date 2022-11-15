package com.pacoteck.springboot.app.service;

import java.util.List;

import com.pacoteck.springboot.app.dto.Cientifico;

public interface ICientifico {

	public void create(Cientifico entity);
	public void update(Cientifico entity);
	public void deleteById(String id);
	public List<Cientifico> findAll();
}
