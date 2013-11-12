package org.serpro.demoiselle.escola.domain;

import java.sql.Time;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Sala {
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private Time inicio;
	
	@Column
	private Time fim;

	@OneToOne
	private Aula aula;
	
	@OneToOne
	private Disciplina disciplina;
	
	@OneToOne
	private Professor professor;
}
