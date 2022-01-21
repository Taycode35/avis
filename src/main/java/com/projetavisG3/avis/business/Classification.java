/**
 * 
 */
package com.projetavisG3.avis.business;

/**
 * @author Audrey, Andrick, Maria
 *
 */
public class Classification {
	private Long id;
	private String nom;
	
	public Classification() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param nom
	 */
	public Classification(Long id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Classification [id=" + id + ", nom=" + nom + "]";
	}
	
	

}
