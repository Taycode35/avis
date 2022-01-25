/**
 * Package
 */
package com.projetavisg3.avis.service.impl;

/**
 * Imports
 */

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projetavisg3.avis.business.Avis;
import com.projetavisg3.avis.business.Jeu;
import com.projetavisg3.avis.dao.AvisDao;
import com.projetavisg3.avis.dao.JeuDao;
import com.projetavisg3.avis.service.JeuService;



/**
 * 
 * @author Audrey, Andrick, maria
 * 
 *
 */


@Service
public class JeuServiceImpl implements JeuService {

	@Autowired
	private  JeuDao jeudao;
	@Autowired
	private AvisDao avisdao;
	

	
	
	@Override
	public List<Jeu> recupererJeu() {
		return jeudao.findAll();
	}
	
	//ajouter un jeu: cette fonction ne concerne que le moderateur

	@Override
	public Jeu ajouterJeu(Jeu jeu) {
		List<Avis> avis1 = avisdao.saveAll(jeu.getAvis());
		Jeu jeua=new Jeu();
		
		if (jeu.getId()!=null) {
			jeua.setNom(jeu.getNom());
			jeua.setDateSortie(jeu.getDateSortie());
			jeua.setDescription(jeu.getDescription());
			jeua.setEditeur(jeu.getEditeur());
			jeua.setGenre(jeu.getGenre());
			jeua.setClassification(jeu.getClassification());
			jeua.setPlateformes(jeu.getPlateformes());
			jeua.setModeleEconomique(jeu.getModeleEconomique());
			jeua.setImage(jeu.getImage());
			jeua.setAvis(avis1);
			jeudao.save(jeua);
			
		}
		return jeudao.save(jeua);
	}
	

	//modifier un jeu: cette fonction ne concerne que le modérateur
	//Nous avons considerer que dans le fait de modifier les fonctionalités 
	//d'un jeu, le modérateur ne peux pas modifier l'avis des joueurs sur ce jeux
	

	@Override
	public Jeu modifierJeu(Jeu jeu) {
		
		Jeu jeu1=jeudao.getById(jeu.getId());
		
		if(jeu1!=null) {
			jeu1.setNom(jeu.getNom());
			jeu1.setDateSortie(jeu.getDateSortie());
			jeu1.setDescription(jeu.getDescription());
			jeu1.setImage(jeu.getImage());
			jeu1.setEditeur(jeu.getEditeur());
			jeu1.setGenre(jeu.getGenre());
			jeu1.setClassification(jeu.getClassification());
			jeu1.setPlateformes(jeu.getPlateformes());
			jeu1.setModeleEconomique(jeu.getModeleEconomique());
			jeudao.save(jeu1);
		}
		
		return jeu1;
		
		
	}

	//sauvegarder un jeu: a revoir
	@Override
	public String sauvegarderJeu(Long id) {
		Jeu jeusauv =jeudao.getById(id);
		if(jeusauv!=null) {
			 jeudao.save(jeusauv);	 
		}
		return "sauvegarde faite";
	}
	
	
	//supprimer un jeu
	@Override
	public String supprimerJeu(Long id) {
		
		Jeu jeusup =jeudao.getById(id);
		
		if (jeudao.existsById(id)) {
			jeudao.delete(jeusup);
			return "success";
		}

		return "this jeu doesn't exist";
		
	}


	

	
}
