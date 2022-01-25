package com.projetavisg3.avis.service;
import java.util.List;
import com.projetavisg3.avis.business.Jeu;





public interface JeuService {

	//ajouter un jeu dans ma base de donnée
	Jeu ajouterJeu(Jeu jeu);
	
	//Obtenir  tous les jeux
	List<Jeu> recupererJeu();
	
	
	//modifier un jeu
	Jeu modifierJeu(Jeu jeu);

	//Sauvegarder ou enregistrer un jeu
	String sauvegarderJeu(Long idjeu);
	
	
	//supprimer un jeu
	
	String supprimerJeu(Long idjeu);
	
	



	

	
	
}
