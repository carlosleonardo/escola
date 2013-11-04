package org.serpro.demoiselle.escola.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

@SuppressWarnings("serial")
@Embeddable
public class CursoPK implements Serializable {
	private AulaPK idAula;
	private Long id;
	
	public AulaPK getIdAula() {
		return idAula;
	}
	public void setIdAula(AulaPK idAula) {
		this.idAula = idAula;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((idAula == null) ? 0 : idAula.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CursoPK other = (CursoPK) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (idAula == null) {
			if (other.idAula != null)
				return false;
		} else if (!idAula.equals(other.idAula))
			return false;
		return true;
	}
}
