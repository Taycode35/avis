/**
 * 
 */
package com.projetavisG3.avis.business;

import java.time.LocalDateTime;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



/**
 * @author Administrator
 *
 */
@Entity
@NoArgsConstructor
@Getter
@Setter

public class Avis {
	private Long id;
	private String description;
	private LocalDateTime dateEnvoi;
	private Float note;
	private LocalDateTime dateModeration;

	

	/**
	 * @param id
	 * @param description
	 * @param dateEnvoi
	 * @param note
	 * @param dateModeration
	 */
	public Avis(Long id, String description, LocalDateTime dateEnvoi, Float note, LocalDateTime dateModeration) {
		super();
		this.id = id;
		this.description = description;
		this.dateEnvoi = dateEnvoi;
		this.note = note;
		this.dateModeration = dateModeration;
	}


	@Override
	public String toString() {
		return "Avis [id=" + id + ", description=" + description + ", dateEnvoi=" + dateEnvoi + ", note=" + note
				+ ", dateModeration=" + dateModeration + "]";
	}
	
	
}
