package com.pacoteck.springboot.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pacoteck.springboot.app.dao.AsignadoDAO;
import com.pacoteck.springboot.app.dto.Asignado;

@Service
public class AsignadoServiceImp implements IAsignado{

	@Autowired
	AsignadoDAO dao;

	@Override
	public void create(Asignado entity) {
		dao.save(entity);
		
	}

	@Override
	public void update(Asignado entity) {
		List<Asignado> aux = dao.findAll();
		for (Asignado asignado : aux) {
			if(asignado.getId() == entity.getId()) {
				dao.save(entity);
				break;
			}
		}
		
	}

	@Override
	public void deleteById(int id) {
		dao.deleteById(id);
		
	}

	@Override
	public List<Asignado> findAll() {
		return dao.findAll();
	}
}
