package com.pacoteck.springboot.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pacoteck.springboot.app.dto.Cientifico;
import com.pacoteck.springboot.app.service.CientificoServiceImp;

@RestController
@RequestMapping("/cientificos")
public class CientificoController {

	@Autowired
	CientificoServiceImp imp;
	
	@GetMapping("/findAll")
	public List<Cientifico> findAll(){
		return imp.findAll();
	}
	
	@PutMapping("/delete{id}")
	public void deleteById(@PathVariable("id") String id) {
		imp.deleteById(id);
	}
	
	@PutMapping("/create")
	public void create(@RequestBody Cientifico cientifico) {
		imp.create(cientifico);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody Cientifico cientifico) {
		imp.update(cientifico);
	}
}
