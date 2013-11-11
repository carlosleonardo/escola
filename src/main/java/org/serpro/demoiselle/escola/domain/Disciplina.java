package org.serpro.demoiselle.escola.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Entity implementation class for Entity: Disciplina
 *
 */
@Entity
public class Disciplina implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;

	@Column(name="NOME")
	@NotNull
	private String nome;
	
	@Column(name="CARGA_HORARIA")
	@NotNull(message="Deve ser informada!")
	private Integer cargaHoraria;
	
	private String descricao;
	
	@OneToMany
	private List<Professor> professores;
	
	public Disciplina() {
		super();
	}

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public String getDescricao() {
		return descricao;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
