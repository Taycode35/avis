package com.projetavisg3.avis.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.projetavisg3.avis.business.Editeur;

//@RepositoryRestResource(exported = true)
public interface EditeurDao extends JpaRepository<Editeur, Long>{
	
	
}
