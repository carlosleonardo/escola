package org.serpro.demoiselle.escola.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Curso
 *
 */
@SuppressWarnings("serial")
@Entity
public class Curso implements Serializable {
   
	@Id
	@GeneratedValue
	private Long id;
	
	@OneToMany
	private List<Aula> aulas;
	
	@Column
	private String nome;
	
	@Column
	private String descricao;
	
}
