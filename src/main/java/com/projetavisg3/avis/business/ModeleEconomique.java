/**
 * 
 */
package com.projetavisg3.avis.business;


import java.util.List;


import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Administrator
 *
 */


@Entity  
@NoArgsConstructor 
@Getter
@Setter 
@ToString
public class ModeleEconomique {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nom;
	
	@OneToMany(mappedBy="modeleEconomique")
	private List<Jeu> jeu;


	
	public ModeleEconomique(String nom) {
		this.nom=nom;
	}

	
	
	

}
