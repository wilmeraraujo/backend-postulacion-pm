package com.emss.postulacion_pm.service;

import java.util.List;

import com.emss.postulacion_pm.entity.PagoSoportadoFactura;

public interface PagoSoportadoFacturaService {
	
	public List<PagoSoportadoFactura> findAll();
	public List<PagoSoportadoFactura> findByRazonSocial(String term);
	
}
