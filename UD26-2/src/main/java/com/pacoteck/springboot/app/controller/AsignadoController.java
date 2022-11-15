package com.pacoteck.springboot.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pacoteck.springboot.app.dto.Asignado;
import com.pacoteck.springboot.app.service.AsignadoServiceImp;


@RestController
@RequestMapping("/asignados")
public class AsignadoController {
	@Autowired
	AsignadoServiceImp imp;
	
	@GetMapping("/findAll")
	public List<Asignado> findAll(){
		return imp.findAll();
	}
	
	@PutMapping("/delete{id}")
	public void deleteById(@PathVariable("id") int id) {
		imp.deleteById(id);
	}
	
	@PutMapping("/create")
	public void create(@RequestBody Asignado asignado)  {
		imp.create(asignado);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody Asignado asignado) {
		imp.update(asignado);
	}

}
