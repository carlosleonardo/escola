package org.serpro.demoiselle.escola.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import org.hibernate.validator.constraints.NotEmpty;

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
   
	@EmbeddedId
	private CursoPK id;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="Aula")
	private List<Aula> aulas;
	
	@Column
	@NotEmpty
	private Integer duracao;
	
	public Integer getDuracao() {
		return duracao;
	}

	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}

	public List<Aula> getAulas() {
		return aulas;
	}

	public void setAulas(List<Aula> aulas) {
		this.aulas = aulas;
	}

}
