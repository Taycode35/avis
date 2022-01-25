package com.projetavisg3.avis.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.projetavisg3.avis.business.Utilisateur;



@RepositoryRestResource(exported = true)
public interface UtilisateurDao extends JpaRepository<Utilisateur, Long>  {

	// Spring Data : requête par dérivation
		Utilisateur findLastByEmailAndMotDePasse(String email, String motDePasse);

		

	

	
	
	
}
