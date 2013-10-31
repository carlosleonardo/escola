package org.serpro.demoiselle.escola.domain;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Pessoa
 * 
 */
@MappedSuperclass
public class Pessoa implements Serializable {

	private String Nome;
	private String CPF;
	private String Identidade;
	private Date dataNascimento;
	private static final long serialVersionUID = 1L;

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

}
