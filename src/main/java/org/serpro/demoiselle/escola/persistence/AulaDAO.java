package org.serpro.demoiselle.escola.persistence;

import org.serpro.demoiselle.escola.domain.Aula;
import org.serpro.demoiselle.escola.domain.AulaPK;

import br.gov.frameworkdemoiselle.stereotype.PersistenceController;
import br.gov.frameworkdemoiselle.template.JPACrud;

@SuppressWarnings("serial")
@PersistenceController
public class AulaDAO extends JPACrud<Aula, AulaPK> {
}
