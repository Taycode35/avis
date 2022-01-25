/**
 * 
 */
package com.projetavisg3.avis.business;





import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;






/**
 * @author Audrey, Andrick, Maria
 * 
 * Il s'agit de la Classe Utilisateur : classe abstraite
 *
 */

@Entity 
@NoArgsConstructor 
@Getter
@Setter 
@ToString
/*
 * L’annotation @Inheritance permet d’indiquer qu’il existe une relation d’héritage 
 * dans le modèle objet et dans le modèle relationnel
 */
@Table(	name = "Utilisateur", 
uniqueConstraints = { 
	@UniqueConstraint(columnNames = "pseudo"),
	@UniqueConstraint(columnNames = "email") 
})
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Utilisateur {
	/*
	 * @param id
	 * L'annotation @GeneratedValue indique que la clé primaire est générée de façon automatique 
	 * lors de l’insertion en base
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected Long id;
	
	@NotBlank
	@Size(max =20)
	protected String pseudo;
	
	@NotBlank
	@Size(max = 120)
	protected String motDePasse;
	
	@NotBlank
	@Size(max = 50)
	//@Email
	protected String email;
	



 
}

