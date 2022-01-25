package com.projetavisg3.avis.controller;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.projetavisg3.avis.business.Moderateur;
import com.projetavisg3.avis.dao.JoueurDao;
import com.projetavisg3.avis.service.impl.ModerateurServiceImpl;

@RestController  
@RequestMapping("/application")
public class ModerateurController {
	

	@Autowired
	ModerateurServiceImpl moderateurImpl;
	@Autowired
	JoueurDao joueurDao;
	
	
	
	//obtenir tous les jeux de ma base de donnée MSQL : @GET
	@GetMapping("/moderateur")
	public List<Moderateur> getAllModerateur(){
		return moderateurImpl.recupererModerateur();
	}
	
	
	//enregistrer un joueur en base: @POST
	@PostMapping("/moderateur")
	public Moderateur createJoueur(@Valid @RequestBody String pseudo, String motDePasse, String email, String numTel) {
		return moderateurImpl.ajouterModerateur(pseudo,motDePasse, email,numTel);
	}

}
