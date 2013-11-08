package org.serpro.demoiselle.escola.business;

import br.gov.frameworkdemoiselle.stereotype.BusinessController;
import br.gov.frameworkdemoiselle.template.DelegateCrud;

import org.serpro.demoiselle.escola.domain.Disciplina;
import org.serpro.demoiselle.escola.persistence.DisciplinaDAO;

@BusinessController
public class DisciplinaBC extends DelegateCrud<Disciplina, Long, DisciplinaDAO> {
	
	private static final long serialVersionUID = 1L;
	
}
