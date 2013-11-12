package org.serpro.demoiselle.escola.business;

import org.serpro.demoiselle.escola.domain.Curso;
import org.serpro.demoiselle.escola.persistence.CursoDAO;
import br.gov.frameworkdemoiselle.stereotype.BusinessController;
import br.gov.frameworkdemoiselle.template.DelegateCrud;

@SuppressWarnings("serial")
@BusinessController
public class CursoBC extends DelegateCrud<Curso, Long, CursoDAO> {
}
