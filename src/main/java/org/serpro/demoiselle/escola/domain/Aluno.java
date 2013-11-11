package org.serpro.demoiselle.escola.domain;

import java.io.Serializable;
import java.lang.Long;
import java.sql.Date;

import javax.persistence.*;

import org.serpro.demoiselle.escola.domain.Pessoa;

/**
 * Entity implementation class for Entity: Aluno
 * 
 */
@SuppressWarnings("serial")
@Entity
public class Aluno extends Pessoa implements Serializable {

	@Id
	@GeneratedValue
	private Long matricula;
	
	private Date dataMatricula;
	
	@OneToOne
	private Curso curso;
	
	public Aluno() {
		super();
	}

	public Long getMatricula() {
		return this.matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public Date getDataMatricula() {
		return this.dataMatricula;
	}

	public void setDataMatricula(Date dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

}
