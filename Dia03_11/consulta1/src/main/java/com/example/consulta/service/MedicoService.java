package com.example.consulta.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import com.example.consulta.model.Medico;
import com.example.consulta.repository.MedicoRepository;


@Service
public class MedicoService {
	@Autowired
	private MedicoRepository repository;

	public Medico findById(String id) {
		Optional<Medico> obj = repository.findById(id);
		return obj.orElse(null);
	}

	public List<Medico> findAll() {
		return repository.findAll();
	}	

	public Medico create(Medico obj) {
		obj.setId(null);
		return repository.save(obj);
	}

}
