package org.serpro.demoiselle.escola.domain;

import java.sql.Time;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Sala {
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private Time horaInicio;
	
	@Column
	private Time horaFim;
	
	@Column
	private boolean reservado;
}
