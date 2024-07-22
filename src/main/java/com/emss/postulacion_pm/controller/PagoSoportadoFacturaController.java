package com.emss.postulacion_pm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emss.postulacion_pm.service.PagoSoportadoFacturaService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/api/v1/pago-soportado-factura")
public class PagoSoportadoFacturaController {

	@Autowired
	private PagoSoportadoFacturaService pagoSoportadoFacturaService;
	
	@GetMapping
	public ResponseEntity<?> getAll(){
		return ResponseEntity.ok().body(pagoSoportadoFacturaService.findAll());
	}
	
	@GetMapping("/search-razon-social/{term}")
	public ResponseEntity<?> filter(@PathVariable String term){
		return ResponseEntity.ok(pagoSoportadoFacturaService.findByRazonSocial(term));
	}
}
