/**
 * 
 */
package com.projetavisG3.avis.business;

/**
 * @author Administrator
 *
 */
public abstract class Utilisateur {
 protected Long id;
 protected String pseudo;
 protected String motDePasse;
 protected String email;
 
 public Utilisateur() {
	
}

/**
 * @param id
 * @param pseudo
 * @param motDePasse
 * @param email
 */
public Utilisateur(Long id, String pseudo, String motDePasse, String email) {
	super();
	this.id = id;
	this.pseudo = pseudo;
	this.motDePasse = motDePasse;
	this.email = email;
}

@Override
public String toString() {
	return "Utilisateur [id=" + id + ", pseudo=" + pseudo + ", motDePasse=" + motDePasse + ", email=" + email + "]";
}
 
 
}

