package com.example.consulta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.consulta.model.Consulta;
import com.example.consulta.service.ConsultaService;




@RestController
@RequestMapping(path = "/consulta")
public class ConsultaController {
	
		
		@Autowired
		private ConsultaService consultaService;

		@GetMapping
		public List<Consulta> findAll() {
			return this.consultaService.findAll();
	}

		@GetMapping(value = "/{id}")
		public ResponseEntity<Consulta> findById(@PathVariable String id) {
			Consulta obj = this.consultaService.findById(id);
			return ResponseEntity.ok().body(obj);
		}
		
		@PostMapping
		public Consulta criar(@RequestBody Consulta consulta) {
			return this.consultaService.create(consulta);
		}
		
		@PutMapping(value = "/{id}")
		public ResponseEntity<Consulta> update(@PathVariable String id, @RequestBody Consulta obj) {
			Consulta newObj = consultaService.update(id, obj);
			return ResponseEntity.ok().body(newObj);
		}

}
