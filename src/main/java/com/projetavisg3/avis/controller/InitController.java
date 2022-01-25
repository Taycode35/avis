package com.projetavisg3.avis.controller;
////TO DOO: deux classifications en faisant appel a classification DAO
////TO DOO: genre, modeleEcono: idem
////TO DOO: rajouter deux jeux 
////TO DOO: rajouter les avis
//
import java.time.LocalDate;

import javax.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import com.projetavisg3.avis.business.Classification;
import com.projetavisg3.avis.business.Editeur;
import com.projetavisg3.avis.business.Genre;
import com.projetavisg3.avis.business.Jeu;
import com.projetavisg3.avis.business.Joueur;
import com.projetavisg3.avis.business.ModeleEconomique;
import com.projetavisg3.avis.business.Moderateur;
import com.projetavisg3.avis.business.Plateforme;
import com.projetavisg3.avis.dao.ClassificationDao;
import com.projetavisg3.avis.dao.EditeurDao;
import com.projetavisg3.avis.dao.GenreDao;
import com.projetavisg3.avis.dao.JeuDao;
import com.projetavisg3.avis.dao.JoueurDao;
import com.projetavisg3.avis.dao.ModeleEconomiqueDao;
import com.projetavisg3.avis.dao.ModerateurDao;
import com.projetavisg3.avis.dao.PlateformaDao;

import antlr.collections.List;



@Controller
public class InitController {
	
	private ClassificationDao classificationDao;
	private EditeurDao editeurDao;
	private GenreDao genreDao;
	private JeuDao jeuDao;
	private JoueurDao joueurDao;
	private ModeleEconomiqueDao modeleeconomiqueDao;
	private ModerateurDao moderateurDao;
	private PlateformaDao plateformeDao;
	

	
	public InitController(ClassificationDao classificationDao, EditeurDao editeurDao, GenreDao genreDao, JeuDao jeuDao,
			JoueurDao joueurDao, ModeleEconomiqueDao modeleeconomiqueDao, ModerateurDao moderateurDao,
			PlateformaDao plateformeDao) {
		super();
		this.classificationDao = classificationDao;
		this.editeurDao = editeurDao;
		this.genreDao = genreDao;
		this.jeuDao = jeuDao;
		this.joueurDao = joueurDao;
		this.modeleeconomiqueDao = modeleeconomiqueDao;
		this.moderateurDao = moderateurDao;
		this.plateformeDao = plateformeDao;
	}


	//postController: rajout des données dans la base MSQL
	@PostConstruct

	private void init() throws Exception {
		
		//deux classifications
		System.out.println("creation des données initiales");
		
		System.out.println("initialisation de deux classificateurs");
		
		classificationDao.save(new Classification("PEGI 12"));
		classificationDao.save(new Classification("PEGI 16"));
		
		System.out.println("initialisation de deux genres");
		
		genreDao.save(new Genre("FPS"));
		genreDao.save(new Genre("GTP"));
		
		System.out.println("initialisation de deux editeurs");
		editeurDao.save(new Editeur("Editis"));
		editeurDao.save(new Editeur("Gallimard"));
		
		System.out.println("initialisation de deux plateformes");
		plateformeDao.save(new Plateforme("Switch"));
		plateformeDao.save(new Plateforme("PS5"));
		
		System.out.println("initialisation de deux modeleeconomique");
		modeleeconomiqueDao.save(new ModeleEconomique("free to play"));
		modeleeconomiqueDao.save(new ModeleEconomique("play to play"));
		
		System.out.println("initialisation de deux joueurs");
		
	
		joueurDao.save(new Joueur("Andrick", "Orsys12", "andrick.com", LocalDate.of(2012, 10, 12)));
		joueurDao.save(new Joueur("Audrey", "Orsys13", "audreykamze@yao.com", LocalDate.of(2013, 10,9)));
		joueurDao.save(new Joueur("Maria", "Orsys14", "maria@yahoo.com", LocalDate.of(2011, 10, 8)));
		
		System.out.println("initialisation d'un moderateur");
		
		moderateurDao.save(new Moderateur("Edging", "Orsys0", "edging.com", "07 12 65 84"));

		
		System.out.println("initialisation de deux jeu");
		

		jeuDao.save(new Jeu("GAMESTORE","jeu de game",LocalDate.of(2022, 1, 12),
				""));
		
		jeuDao.save(new Jeu("STARGET","jeu de star",LocalDate.of(2022, 2, 12),
				""));
		
		System.out.println("Liste des Joueus");
		
		
		
		
		
		
		
		
		
	}




		
		
		
		
		
		
		
			
	
	
	
	
	
	
	
	

}
