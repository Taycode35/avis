/**
 * 
 */
package com.projetavisg3.avis.business;

import java.time.LocalDateTime;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



/**
 * @author Audrey, Andrick, Maria
 * 
 * Il s'agit de la Classe Avis
 *
 */


/*
 * @Entity Indique que la classe Avis est une classe persistante
 * @NoArgsConstructor: constructeur sans paramètre
 * @Getter, @Setter : Getter et setter de la classe Avis
 */
@Entity 
@NoArgsConstructor 
@Getter
@Setter 
@ToString
public class Avis {
	/*
	 * @param id
	 * L'annotation @GeneratedValue indique que la clé primaire est générée de façon automatique 
	 * lors de l’insertion en base
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String description;
	private LocalDateTime dateEnvoi;
	@Size(min = 0, max = 20)
	private Float note;
	private LocalDateTime dateModeration;
	
	/*
	 * Relation manyToOne: Plusieurs avis peuvent être donnés par un seul joueur
	 * Plusieurs avis peuvent être regardés par un seul modérateur
	 * joueur et modérateur sont les classes extends de la classe abstraite Utilisateur
	 */
	@ManyToOne
	private Joueur joueur;
	
	
	@ManyToOne
	private Moderateur moderateur;
	
	@ManyToOne
	private Jeu jeu;
	
	

	public Avis(String description, LocalDateTime dateEnvoi, Float note) {
		super();
		this.description = description;
		this.dateEnvoi = dateEnvoi;
		this.note = note;
	}

	
	

	
	
}
