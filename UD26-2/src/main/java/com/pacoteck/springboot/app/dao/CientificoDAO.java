package com.pacoteck.springboot.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pacoteck.springboot.app.dto.Cientifico;

public interface CientificoDAO extends JpaRepository<Cientifico, String>{

}
