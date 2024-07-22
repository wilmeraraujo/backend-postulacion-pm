package com.emss.postulacion_pm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emss.postulacion_pm.entity.PagoSoportadoFactura;
import com.emss.postulacion_pm.repository.PagoSoportadoFacturaRepository;

@Service
public class PagoSoportadoFacturaServiceImpl implements PagoSoportadoFacturaService {

	@Autowired
	private PagoSoportadoFacturaRepository pagoSoportadoFacturaRepository;
	
	@Override
	public List<PagoSoportadoFactura> findAll() {
		return pagoSoportadoFacturaRepository.findAll() ;
	}

	@Override
	public List<PagoSoportadoFactura> findByRazonSocial(String term) {
		return pagoSoportadoFacturaRepository.findByRazonSocial(term);
	}

}
