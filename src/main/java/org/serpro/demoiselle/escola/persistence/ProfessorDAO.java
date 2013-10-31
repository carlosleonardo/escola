package org.serpro.demoiselle.escola.persistence;

import br.gov.frameworkdemoiselle.stereotype.PersistenceController;
import br.gov.frameworkdemoiselle.template.JPACrud;

import org.serpro.demoiselle.escola.domain.Professor;

@PersistenceController
public class ProfessorDAO extends JPACrud<Professor, Long> {

	private static final long serialVersionUID = 1L;
	

}
