/**
 * 
 */
package com.projetavisG3.avis.business;

/**
 * @author Administrator
 *
 */
public class Genre {
	private Long id;
	private String nom;
	
	
public Genre() {
	// TODO Auto-generated constructor stub
}


/**
 * @param id
 * @param nom
 */
public Genre(Long id, String nom) {
	super();
	this.id = id;
	this.nom = nom;
}


@Override
public String toString() {
	return "Genre [id=" + id + ", nom=" + nom + "]";
}


}
