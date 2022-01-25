package com.projetavisg3.avis.service;

import java.time.LocalDate;
import java.util.List;

import com.projetavisg3.avis.business.Joueur;

public interface JoueurService {
	
	Joueur ajouterJoueur(String pseudo, String motDePasse, String email, LocalDate dateDeNaissance);

	public List<Joueur> recupererJoueur();


}
