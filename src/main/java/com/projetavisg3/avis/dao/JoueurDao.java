package com.projetavisg3.avis.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.projetavisg3.avis.business.Joueur;



@RepositoryRestResource(exported = true)
public interface JoueurDao extends JpaRepository<Joueur, Long> {

}
