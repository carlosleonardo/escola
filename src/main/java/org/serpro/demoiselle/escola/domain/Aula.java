package org.serpro.demoiselle.escola.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Aula
 *
 */
@SuppressWarnings("serial")
@Entity
public class Aula implements Serializable {
	@EmbeddedId
	private AulaPK idAula;

	@OneToMany
	private List<Aluno> alunos;
	
	public Aula() {
		super();
	}

	public AulaPK getIdAula() {
		return idAula;
	}

	public void setIdAula(AulaPK idAula) {
		this.idAula = idAula;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

}
