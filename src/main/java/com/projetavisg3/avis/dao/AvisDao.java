package com.projetavisg3.avis.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.projetavisg3.avis.business.Avis;






@RepositoryRestResource(exported = true)
public interface AvisDao extends JpaRepository<Avis, Long> {

	
	
	List<Avis> findAll();

	
	
	
	
	
	
}
