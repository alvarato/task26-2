package com.pacoteck.springboot.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pacoteck.springboot.app.dto.Proyecto;
import com.pacoteck.springboot.app.service.ProyectoServiceImp;

@RestController
@RequestMapping("/proyectos")
public class ProyectoController {

	@Autowired
	ProyectoServiceImp imp;
	
	@GetMapping("/findAll")
	public List<Proyecto> findAll(){
		return imp.findAll();
	}
	
	
	@PutMapping("/delete{id}")
	public void deleteById(@PathVariable("id") String id) {
		imp.deleteById(id);
	}
	
	@PutMapping("/create")
	public void create(@RequestBody Proyecto proyecto) {
		imp.create(proyecto);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody Proyecto proyecto) {
		imp.update(proyecto);
	}
}
