package org.serpro.demoiselle.escola.business;

import br.gov.frameworkdemoiselle.stereotype.BusinessController;
import br.gov.frameworkdemoiselle.template.DelegateCrud;

import org.serpro.demoiselle.escola.domain.Aluno;
import org.serpro.demoiselle.escola.persistence.AlunoDAO;

@BusinessController
public class AlunoBC extends DelegateCrud<Aluno, Long, AlunoDAO> {
	
	private static final long serialVersionUID = 1L;
	
}
