package com.projetavisg3.avis.dao;







import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.projetavisg3.avis.business.Jeu;





@RepositoryRestResource(exported = true)
public interface JeuDao extends JpaRepository<Jeu,Long>{
	
	
	Optional<Jeu> findById(Long id);
	
	
	@Query("select e from Jeu e where e.nom like :x")
	Jeu chercherJeu(@Param("x") Long id);
	

	
	
}
