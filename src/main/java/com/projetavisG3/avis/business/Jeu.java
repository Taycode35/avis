/**
 * 
 */
package com.projetavisG3.avis.business;

import java.time.LocalDate;

/**
 * @author Administrator
 *
 */
public class Jeu {
	private Long id;
	private String nom;
	private String description;
	private LocalDate dateSortie;
	private String image;
	
	
	public Jeu() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param id
	 * @param nom
	 * @param description
	 * @param dateSortie
	 * @param image
	 */
	public Jeu(Long id, String nom, String description, LocalDate dateSortie, String image) {
		super();
		this.id = id;
		this.nom = nom;
		this.description = description;
		this.dateSortie = dateSortie;
		this.image = image;
	}


	@Override
	public String toString() {
		return "Jeu [id=" + id + ", nom=" + nom + ", description=" + description + ", dateSortie=" + dateSortie
				+ ", image=" + image + "]";
	}
	
	

}
