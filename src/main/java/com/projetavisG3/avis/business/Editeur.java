/**
 * 
 */
package com.projetavisG3.avis.business;

/**
 * @author Administrator
 *
 */
public class Editeur {
	private Long id;
	private String nom;
	
	
	public Editeur() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param id
	 * @param nom
	 */
	public Editeur(Long id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}


	@Override
	public String toString() {
		return "Editeur [id=" + id + ", nom=" + nom + "]";
	}
	
	
}
