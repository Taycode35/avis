/**
 * 
 */
package com.projetavisg3.avis.business;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**z
 * @author Audrey, Andrick, Maria
 * 
 * Il s'agit de la Classe Joueur qui extend de la classe Utilisateur
 * Elle hérrite de toutes les attibuts et les méthodes de la classe mère Utilisateur
 */

/*
 * @Entity Indique que la classe Joueur est une classe persistante
 * @NoArgsConstructor: constructeur sans paramètre
 * @Getter, @Setter : Getter et setter de la classe Joueur
 * 
 */
@Entity 
@NoArgsConstructor
@Getter
@Setter
public class Joueur extends Utilisateur {
	private LocalDate dateDeNaissance;


	@OneToMany(mappedBy="joueur")
	private List<Avis> avis;



	public Joueur(String pseudo, String motDePasse, String email, LocalDate dateDeNaissance) {
		this.pseudo=pseudo;
		this.motDePasse=motDePasse;
		this.email=email;
		this.dateDeNaissance=dateDeNaissance;
	}



	
	
	


		
	

	
}
