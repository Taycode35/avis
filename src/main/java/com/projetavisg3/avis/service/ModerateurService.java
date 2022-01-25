package com.projetavisg3.avis.service;

import java.util.List;
import com.projetavisg3.avis.business.Moderateur;

public interface ModerateurService {

	
	Moderateur ajouterModerateur(String pseudo, String motDePasse, String email, String numTel);
	
	public List<Moderateur> recupererModerateur();



}
