package org.serpro.demoiselle.escola.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Entity implementation class for Entity: Professor
 *
 */
@Entity
public class Professor extends Pessoa implements Serializable {
	
	private static final long serialVersionUID = 1L;

	public Professor() {
		super();
	}

	@Id
	@GeneratedValue
	private Long id;

	@OneToOne
	private Disciplina disciplina;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
