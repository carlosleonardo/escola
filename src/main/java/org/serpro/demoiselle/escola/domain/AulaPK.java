package org.serpro.demoiselle.escola.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Embeddable
public class AulaPK implements Serializable {
	
	@Temporal(TemporalType.TIME)
	private Date horaInicio;
	
	@Temporal(TemporalType.TIME)
	private Date horaFim;
	
	private Long idProfessor;
	private Long idDisciplina;
	private Long idSala;
	
	public Long getIdProfessor() {
		return idProfessor;
	}
	public void setIdProfessor(Long idProfessor) {
		this.idProfessor = idProfessor;
	}
	public Long getIdDisciplina() {
		return idDisciplina;
	}
	public void setIdDisciplina(Long idDisciplina) {
		this.idDisciplina = idDisciplina;
	}
	
	@Override
	public boolean equals(Object objeto) {
		AulaPK outro = (AulaPK) objeto;
		return (outro.idDisciplina==this.idDisciplina && outro.idProfessor == this.idProfessor &&
				outro.horaInicio.equals(this.horaInicio) && outro.horaFim.equals(this.horaFim));
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	public Date getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(Date horaInicio) {
		this.horaInicio = horaInicio;
	}
	public Date getHoraFim() {
		return horaFim;
	}
	public void setHoraFim(Date horaFim) {
		this.horaFim = horaFim;
	}
	public Long getIdSala() {
		return idSala;
	}
	public void setIdSala(Long idSala) {
		this.idSala = idSala;
	}
}
