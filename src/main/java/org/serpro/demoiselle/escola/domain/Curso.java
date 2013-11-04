package org.serpro.demoiselle.escola.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Curso
 *
 */
@SuppressWarnings("serial")
@Entity
public class Curso implements Serializable {
	public Curso() {
		super();
	}
   
	@Id
	@GeneratedValue
	private Long id;
	
	private Integer duracao;
	
	public Integer getDuracao() {
		return duracao;
	}

	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}

	public Long getId() {
		return id;
	}
	
}
