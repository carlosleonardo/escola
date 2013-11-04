package org.serpro.demoiselle.escola.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 * Entity implementation class for Entity: Aula
 *
 */
@SuppressWarnings("serial")
@Entity
public class Aula implements Serializable {
	@EmbeddedId
	private AulaPK idAula;

	public Aula() {
		super();
	}

	public AulaPK getIdAula() {
		return idAula;
	}

	public void setIdAula(AulaPK idAula) {
		this.idAula = idAula;
	}

}
