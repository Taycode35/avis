/**
 * 
 */
package com.projetavisG3.avis.business;

import java.time.LocalDate;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Administrator
 * Audrey: ajout
 *
 */
@Entity
@NoArgsConstructor
@Getter
@Setter
public class Joueur extends Utilisateur {

	private LocalDate dateDeNaissance;
	
	
	
}
