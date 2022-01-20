/**
 * 
 */
package com.projetavisG3.avis.business;

/**
 * @author Administrator
 *
 */
public class Plateforme {
	private Long id;
	private String nom;
	
	public Plateforme() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param nom
	 */
	public Plateforme(Long id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Plateforme [id=" + id + ", nom=" + nom + "]";
	}
	
	

}
