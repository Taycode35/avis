package com.projetavisg3.avis.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetavisg3.avis.business.Joueur;
import com.projetavisg3.avis.dao.JoueurDao;
import com.projetavisg3.avis.service.JoueurService;

@Service
public class JoueurServiceImpl implements JoueurService{
	@Autowired
	JoueurDao joueurDao;

	
	@Override
	public List<Joueur> recupererJoueur() {
		return joueurDao.findAll();
	}
	
	
	@Override
	public Joueur ajouterJoueur(String pseudo, String motDePasse, String email, LocalDate dateDeNaissance) {
		Joueur joueur = new Joueur();
		joueur.setDateDeNaissance(dateDeNaissance);
		joueur.setPseudo(pseudo);
		joueur.setMotDePasse(motDePasse);
		joueur.setEmail(email);
		joueur= joueurDao.save(joueur);

		return joueur;
	}
	
	
	
	
}
