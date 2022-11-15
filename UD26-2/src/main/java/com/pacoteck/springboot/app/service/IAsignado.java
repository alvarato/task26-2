package com.pacoteck.springboot.app.service;

import java.util.List;
import com.pacoteck.springboot.app.dto.Asignado;

public interface IAsignado {

	public void create(Asignado entity);
	public void update(Asignado entity);
	public void deleteById(int id);
	public List<Asignado> findAll();
}
