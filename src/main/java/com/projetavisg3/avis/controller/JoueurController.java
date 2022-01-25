package com.projetavisg3.avis.controller;


import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.projetavisg3.avis.business.Joueur;
import com.projetavisg3.avis.dao.JoueurDao;
import com.projetavisg3.avis.service.impl.JoueurServiceImpl;





@RestController  
@RequestMapping("/application")
public class JoueurController {

	
	
	@Autowired
	JoueurServiceImpl joueurImpl;
	@Autowired
	JoueurDao joueurDao;
	
	
	
	//obtenir tous les jeux de ma base de donnée MSQL : @GET
	@GetMapping("/joueur")
	public List<Joueur> getAllJeux(){
		return joueurImpl.recupererJoueur();
	}
	
	
	//enregistrer un joueur en base: @POST
	@PostMapping("/joueur")
	public Joueur createJoueur(@Valid @RequestBody Joueur j) {
		return joueurImpl.ajouterJoueur(j.getPseudo(),j.getMotDePasse(),j.getEmail(),j.getDateDeNaissance());
	}
	
		
	
}
