package com.registerstudent.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.registerstudent.modal.Estudante;
import com.registerstudent.repository.EstudanteRepository;
import com.registerstudent.service.EstudanteService;

@Service
public class EstudanteServiceImpl implements EstudanteService {
	
	@Autowired
	private EstudanteRepository repository;

	@Override
	public Estudante seve(Estudante estudante) {
		return repository.save(estudante);
	}

	@Override
	public Estudante findById(Integer matricula) {
		Optional<Estudante> estudante = repository.findById(matricula);
		if (! estudante.isPresent()) {
			throw new EmptyResultDataAccessException(1);
		}
		return estudante.get();
	}

}