package com.alexseyf.api.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.alexseyf.api.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepositoryImplementation<Cliente, Long> {
	
}
