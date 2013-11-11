package org.serpro.demoiselle.escola.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * Entity implementation class for Entity: Aula
 *
 */
@SuppressWarnings("serial")
@Entity
public class Aula implements Serializable {
	@EmbeddedId
	private AulaPK id;

	@OneToMany
	private List<Aluno> alunos;
	
	@OneToOne
	private Disciplina disciplina;
	
	public Aula() {
		super();
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public AulaPK getId() {
		return id;
	}

	public void setId(AulaPK id) {
		this.id = id;
	}

}
