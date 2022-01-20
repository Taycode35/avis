/**
 * 
 */
package com.projetavisG3.avis.business;

/**
 * @author Administrator
 *
 */
public class ModeleEconomique {
	private Long id;
	private String nom;
	
	public ModeleEconomique() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param nom
	 */
	public ModeleEconomique(Long id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "ModeleEconomique [id=" + id + ", nom=" + nom + "]";
	}
	
	

}
