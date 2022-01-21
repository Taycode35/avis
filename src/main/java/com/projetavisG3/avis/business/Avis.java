/**
 * 
 */
package com.projetavisG3.avis.business;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



/**
 * @author Audrey, Andrick, Maria
 *
 */



/*
 * @Entity Indique que la classe Avis est une classe persistante
 * @NoArgsConstructor: constructeur sans paramètre
 * @Getter, @Setter : Getter et setter de la classe Avis
 * @ToString: Genère le toString de laclasse
 */
@Entity 
@NoArgsConstructor 
@Getter
@Setter 
@ToString(of = {"id", "description", "dateEnvoi","note","dateModeration"})
public class Avis {
	/*
	 * @param id
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String description;
	private LocalDateTime dateEnvoi;
	private Float note;
	private LocalDateTime dateModeration;

	
	/**
	 * @param description
	 * @param dateEnvoi
	 * @param note
	 * @param dateModeration
	 */
	public Avis( String description, LocalDateTime dateEnvoi, Float note, LocalDateTime dateModeration) {
		super();
		this.description = description;
		this.dateEnvoi = dateEnvoi;
		this.note = note;
		this.dateModeration = dateModeration;
	}
	
}
