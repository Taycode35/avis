package com.projetavisg3.avis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetavisg3.avis.business.Moderateur;
import com.projetavisg3.avis.dao.ModerateurDao;
import com.projetavisg3.avis.service.ModerateurService;

@Service
public class ModerateurServiceImpl implements ModerateurService{
	@Autowired
	ModerateurDao moderateurDao;
	
	
	
	@Override
	public List<Moderateur> recupererModerateur() {
		return moderateurDao.findAll();
		
	}

	
	
	@Override
	public Moderateur ajouterModerateur(String pseudo, String motDePasse, String email, String numTel){
		
		Moderateur moderateur=new Moderateur();
		moderateur.setNumeroDeTelephone(numTel);
		moderateur.setPseudo(pseudo);
		moderateur.setMotDePasse(motDePasse);
		moderateur.setEmail(email);
		moderateur= moderateurDao.save(moderateur);
		return moderateur;
	}


}
