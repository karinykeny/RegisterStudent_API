package com.registerstudent.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.registerstudent.modal.Estudante;

public interface EstudanteRepository extends JpaRepository<Estudante, Integer> {

	Estudante findByCpf(String cpf);

}
