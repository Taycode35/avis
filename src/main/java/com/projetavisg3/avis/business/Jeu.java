/**
 * 
 */
package com.projetavisg3.avis.business;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Administrator
 *
 */
@Entity
@Table
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Jeu {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String description;
	private LocalDate dateSortie; 
	private String image;

	@OneToMany (mappedBy="jeu") 
	private List<Avis> avis;

	
	@ManyToOne
	private Classification classification;

	@ManyToOne
	private Genre genre;

	
	@ManyToOne
	private Editeur editeur;

	@ManyToOne
	private ModeleEconomique modeleEconomique;

	@ManyToMany
	private List<Plateforme> plateformes;

	@ManyToOne
	private Moderateur moderateur;

	public Jeu(String nom, String description, LocalDate dateSortie, String image) {
		super();
		this.nom = nom;
		this.description = description;
		this.dateSortie = dateSortie;
		this.image = image;
	}



	
	
	
	
}
