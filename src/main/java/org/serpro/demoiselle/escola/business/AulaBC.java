package org.serpro.demoiselle.escola.business;

import org.serpro.demoiselle.escola.domain.Aula;
import org.serpro.demoiselle.escola.domain.AulaPK;
import org.serpro.demoiselle.escola.persistence.AulaDAO;

import br.gov.frameworkdemoiselle.stereotype.BusinessController;
import br.gov.frameworkdemoiselle.template.DelegateCrud;

@SuppressWarnings("serial")
@BusinessController
public class AulaBC  extends DelegateCrud<Aula, AulaPK, AulaDAO> {
}
