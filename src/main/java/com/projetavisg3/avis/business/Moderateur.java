/**
 * 
 */
package com.projetavisg3.avis.business;
import javax.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * @author Audrey, Andrick, Maria
 * 
 * Il s'agit de la Classe Moderateur qui extend de la classe Utilisateur
 * Elle hérrite de toutes les attibuts et les méthodes de la classe mère Utilisateur
 */

/*
 * @Entity Indique que la classe Moderateur est une classe persistante
 * @NoArgsConstructor: constructeur sans paramètre
 * @Getter, @Setter : Getter et setter de la classe Moderateur
 * 
 */
@Entity 
@NoArgsConstructor
@Getter
@Setter
public class Moderateur extends Utilisateur {

	private String numeroDeTelephone;
	
	


	public Moderateur(String pseudo, String motDePasse, String email, String numTel) {
		this.pseudo=pseudo;
		this.motDePasse=motDePasse;
		this.email=email;
		this.numeroDeTelephone=numTel;
	}
	
	


	
	
	
}
