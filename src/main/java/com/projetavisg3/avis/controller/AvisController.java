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
import com.projetavisg3.avis.business.Avis;
import com.projetavisg3.avis.dao.AvisDao;
import com.projetavisg3.avis.service.impl.AvisServiceImpl;




@RestController  
@RequestMapping("/application")
public class AvisController {
	
	@Autowired
	AvisServiceImpl avisserviceimpl;
	@Autowired
	AvisDao avisdao;
	
	//obtenir tous les jeux de ma base de donnée MSQL : @GET
	@ResponseStatus(code=HttpStatus.ACCEPTED)
	@GetMapping("/avis")
	public List<Avis> getAllavis(){
		return avisserviceimpl.voirTousLesAvis();
	}
	
	//enregistrer un jeu en base: @POST
	@PostMapping("/avis")
	public Avis createAvis(@Valid @RequestBody Avis avis) {
		return avisserviceimpl.ajouterAvis(avis);
	}
	
	
	//modifier un jeu: on recupère le jeu par son id et on le modifi
	@PutMapping("/avis/{id}")
	public Avis updateJeu(@PathVariable(value = "id") Long id,
	  @Valid @RequestBody Avis avisUpdate) {
	     return avisserviceimpl.modifierAvis(avisUpdate, id);
	     
	     
	}
	
	
	@DeleteMapping("/avis/{id}")
    public String deleteJeu(@PathVariable(value="id") Long idavis) {
			 avisserviceimpl.supprimerAvis(idavis);
			 return "Done";
	}
	
	
	
	

}
