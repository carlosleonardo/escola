package org.serpro.demoiselle.escola.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Professor
 *
 */
@SuppressWarnings("serial")
@Entity
public class Professor extends Pessoa implements Serializable {

	@Id
	@GeneratedValue
	private Long id;
}
