package org.serpro.demoiselle.escola.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Sala {
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	@Temporal(TemporalType.TIME)
	private Date inicio;
	
	@Column
	@Temporal(TemporalType.TIME)
	private Date fim;

	@OneToOne
	private Aula aula;
	
	@OneToOne
	private Disciplina disciplina;
	
	@OneToOne
	private Professor professor;
}
