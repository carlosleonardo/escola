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
	
	private List<Aula> aulas;
	
	private Integer duracao;
	
	public List<Aula> getAulas()
	{
		return aulas;
	}

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
