package com.projetavisg3.avis.service;

import java.util.List;

import com.projetavisg3.avis.business.Avis;



public interface AvisService {
	
	//ajouter un jeu dans ma base de donnée
	Avis ajouterAvis(Avis avis);
	
	List<Avis> voirTousLesAvis();
	

	String supprimerAvis(Long id);
	

	Avis modifierAvis(Avis avis, Long id);
	
	String sauvegarderAvis(Long id);
	
}
