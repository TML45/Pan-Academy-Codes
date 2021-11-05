package com.example.consulta.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.consulta.model.Consulta;
import com.example.consulta.repository.ConsultaRepository;

@Service
public class ConsultaService {

	@Autowired
	private ConsultaRepository repository;

	public Consulta findById(String id) {
		Optional<Consulta> obj = repository.findById(id);
		return obj.orElse(null);
	}

	public List<Consulta> findAll() {
		return repository.findAll();
	}

	public Consulta create(Consulta obj) {
		obj.setId(null);
		return repository.save(obj);
	}

}
