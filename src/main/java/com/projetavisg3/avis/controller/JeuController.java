package com.projetavisg3.avis.controller;



import java.util.List;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.projetavisg3.avis.business.Jeu;
import com.projetavisg3.avis.dao.JeuDao;
import com.projetavisg3.avis.service.impl.JeuServiceImpl;




@RestController  
@RequestMapping("/application")
public class JeuController {
	
	@Autowired
	JeuServiceImpl jeuserviceimpl;
	@Autowired
	JeuDao jeudao;
	
	//obtenir tous les jeux de ma base de donnée MSQL : @GET
	@ResponseStatus(code=HttpStatus.ACCEPTED)
	@GetMapping("/jeux")
	public List<Jeu> getAllJeux(){
		return jeuserviceimpl.recupererJeu();
	}
	
	//enregistrer un jeu en base: @POST
	@PostMapping("/jeux")
	public Jeu createJeu(@Valid @RequestBody Jeu jeu) {
		return jeuserviceimpl.ajouterJeu(jeu);
	}
	
	
	//modifier un jeu: on recupère le jeu par son id et on le modifi
	@PutMapping("/jeux/{id}")
	public Jeu updateJeu(@PathVariable(value = "id") Long idjeur,
	  @Valid @RequestBody Jeu jeu) {
		
	     return jeuserviceimpl.modifierJeu(jeu);
	     
	     
	}
	
	
	@DeleteMapping("/jeux/{id}")
    public String deleteJeu(@PathVariable(value="id") Long idjeus) {
			 jeuserviceimpl.supprimerJeu(idjeus);
			 return "Done";
	}
	
	
	
}
	

