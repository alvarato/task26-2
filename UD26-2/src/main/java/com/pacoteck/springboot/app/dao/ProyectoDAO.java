package com.pacoteck.springboot.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pacoteck.springboot.app.dto.Proyecto;

public interface ProyectoDAO extends JpaRepository<Proyecto, String>{

}
