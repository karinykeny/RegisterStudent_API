package com.registerstudent.service;

import com.registerstudent.modal.Estudante;

public interface EstudanteService {

	Estudante seve(Estudante estudante);

	Estudante findById(Integer matricula);

	Estudante update(Estudante estudante);

}
