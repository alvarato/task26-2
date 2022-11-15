package com.pacoteck.springboot.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pacoteck.springboot.app.dao.CientificoDAO;
import com.pacoteck.springboot.app.dto.Cientifico;

@Service
public class CientificoServiceImp implements ICientifico {
	
	@Autowired
	CientificoDAO dao;
	
	@Override
	public void create(Cientifico entity) {
		dao.save(entity);

	}

	@Override
	public void update(Cientifico entity) {
		List<Cientifico> aux = dao.findAll();
		for (Cientifico cientifico : aux) {
			if(cientifico.getDni().equals(entity.getDni())) {
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
	public List<Cientifico> findAll() {
		return dao.findAll();
	}

}
