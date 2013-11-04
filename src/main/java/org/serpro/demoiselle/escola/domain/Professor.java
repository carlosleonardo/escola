package org.serpro.demoiselle.escola.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.ForeignKey;
import org.hibernate.validator.constraints.NotBlank;

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
	
	@Column
	@ForeignKey(name = "ID")
	private Long idDisciplina;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdDisciplina() {
		return idDisciplina;
	}

	public void setIdDisciplina(Long idDisciplina) {
		this.idDisciplina = idDisciplina;
	}
}
