package org.serpro.demoiselle.escola.business;

import br.gov.frameworkdemoiselle.stereotype.BusinessController;
import br.gov.frameworkdemoiselle.template.DelegateCrud;

import org.serpro.demoiselle.escola.domain.Professor;
import org.serpro.demoiselle.escola.persistence.ProfessorDAO;

@BusinessController
public class ProfessorBC extends DelegateCrud<Professor, Long, ProfessorDAO> {
	
	private static final long serialVersionUID = 1L;
	
}
