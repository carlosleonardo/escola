package org.serpro.demoiselle.escola.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Future;
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

	@Column
	@NotNull(message="Informe nome")
	@Size(min=20, max=100, message="Nome deve ter entre 20 e 100 caracteres")
	private String Nome;
	
	@Column
	@Cpf
	private String CPF;
	
	@Column
	private String Identidade;
	
	@Column
	private Date dataNascimento;
	
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
