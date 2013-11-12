package org.serpro.demoiselle.escola.domain;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.gov.frameworkdemoiselle.validation.annotation.Cpf;

/**
 * Entity implementation class for Entity: Pessoa
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
public class Pessoa implements Serializable {

	@Column(name="NOME")
	@NotNull
	@Size(min=20, max=100)
	private String Nome;
	
	@Column(name="CPF")
	@Cpf
	private String CPF;
	
	@Column(name="RG")
	private String Identidade;
	
	@Column(name="DATA_NASCIMENTO")
	private Date dataNascimento;
	
	@Column
	@NotNull
	@Size(max=20)
	private String telefone;
	
	@Column
	@Size(max=100)
	private String Endereco;
	
	public Pessoa() {
		super();
	}

	public String getNome() {
		return this.Nome;
	}

	public void setNome(String Nome) {
		this.Nome = Nome;
	}

	public String getCPF() {
		return this.CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}

	public String getIdentidade() {
		return this.Identidade;
	}

	public void setIdentidade(String Identidade) {
		this.Identidade = Identidade;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CPF == null) ? 0 : CPF.hashCode());
		result = prime * result
				+ ((Identidade == null) ? 0 : Identidade.hashCode());
		result = prime * result + ((Nome == null) ? 0 : Nome.hashCode());
		result = prime * result
				+ ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
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
		Pessoa other = (Pessoa) obj;
		if (CPF == null) {
			if (other.CPF != null)
				return false;
		} else if (!CPF.equals(other.CPF))
			return false;
		if (Identidade == null) {
			if (other.Identidade != null)
				return false;
		} else if (!Identidade.equals(other.Identidade))
			return false;
		if (Nome == null) {
			if (other.Nome != null)
				return false;
		} else if (!Nome.equals(other.Nome))
			return false;
		if (dataNascimento == null) {
			if (other.dataNascimento != null)
				return false;
		} else if (!dataNascimento.equals(other.dataNascimento))
			return false;
		return true;
	}

}
