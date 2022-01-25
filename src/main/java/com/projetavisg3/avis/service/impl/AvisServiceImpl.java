package com.projetavisg3.avis.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projetavisg3.avis.business.Avis;
import com.projetavisg3.avis.dao.AvisDao;
import com.projetavisg3.avis.service.AvisService;

@Service
public class AvisServiceImpl implements AvisService{
	@Autowired
	AvisDao avisdao;
	

	//ajouter un avis: le joueur peut ajouter un avis pour un jeu
	@Override
	public Avis ajouterAvis(Avis avis) {
		Avis AvisA=new Avis();
		
		AvisA.setDescription(avis.getDescription());
		AvisA.setDateEnvoi(avis.getDateEnvoi());
		AvisA.setNote(avis.getNote());
		AvisA.setDateModeration(avis.getDateModeration());
		AvisA.setJoueur(avis.getJoueur());
		AvisA.setModerateur(avis.getModerateur());
		AvisA.setJeu(avis.getJeu());
		return avisdao.save(AvisA);
	}


	@Override
	public List<Avis> voirTousLesAvis() {
		return avisdao.findAll();
	}


	@Override
	public String supprimerAvis(Long id) {
	
		Avis avis1=avisdao.getById(id);
		avisdao.delete(avis1);
		return "success";
		
	}


	@Override
	public Avis modifierAvis(Avis avis, Long id) {
		
		 Avis avisB=avisdao.getById(id);
		
		avisB.setDescription(avis.getDescription());
		avisB.setDateEnvoi(avis.getDateEnvoi());
		avisB.setNote(avis.getNote());
		avisB.setDateModeration(avis.getDateModeration());
		avisB.setJoueur(avis.getJoueur());
		avisB.setModerateur(avis.getModerateur());
		avisB.setJeu(avis.getJeu());
		avisdao.save(avisB);
		return avisB;
	}


	@Override
	public String sauvegarderAvis(Long id) {
		
		Avis avissauv =avisdao.getById(id);
		 avisdao.save(avissauv);
		 return "sauvegarde faite";
	}
	

}
