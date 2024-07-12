package com.emss.postulacion_pm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emss.postulacion_pm.service.PagoSoportadoService;

@RestController
@RequestMapping(value = "/api/v1/pago-soportado")
public class PagoSoportadoController {

	@Autowired
	private PagoSoportadoService pagoSoportadoService;
	
	@GetMapping
	public ResponseEntity<?> getAll(){
		return ResponseEntity.ok().body(pagoSoportadoService.findAll());
	}
}
