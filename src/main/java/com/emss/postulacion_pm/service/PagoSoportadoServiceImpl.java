package com.emss.postulacion_pm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emss.postulacion_pm.entity.PagoSoportado;
import com.emss.postulacion_pm.repository.PagoSoportadoRepository;

@Service
public class PagoSoportadoServiceImpl implements PagoSoportadoService {

	@Autowired
	private PagoSoportadoRepository pagoSoportadoRepository;
	
	@Override
	public List<PagoSoportado> findAll() {
		return pagoSoportadoRepository.findAll() ;
	}

}
