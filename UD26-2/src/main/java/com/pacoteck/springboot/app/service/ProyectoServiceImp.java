package com.pacoteck.springboot.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pacoteck.springboot.app.dao.ProyectoDAO;
import com.pacoteck.springboot.app.dto.Proyecto;

@Service
public class ProyectoServiceImp implements IProyecto{

	@Autowired
	ProyectoDAO dao;

	@Override
	public void create(Proyecto entity) {
		dao.save(entity);
		
	}

	@Override
	public void update(Proyecto entity) {
		List<Proyecto> aux = dao.findAll();
		for (Proyecto proyecto : aux) {
			if(proyecto.getId().equals(entity.getId())) {
				dao.save(entity);
				break;
			}
		}
		
	}

	@Override
	public void deleteById(String id) {
		dao.deleteById(id);
		
	}

	@Override
	public List<Proyecto> findAll() {
		return dao.findAll();
	}
}
