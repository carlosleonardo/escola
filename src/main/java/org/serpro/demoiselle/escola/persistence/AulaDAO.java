package org.serpro.demoiselle.escola.persistence;

import org.serpro.demoiselle.escola.domain.Aula;
import br.gov.frameworkdemoiselle.stereotype.PersistenceController;
import br.gov.frameworkdemoiselle.template.JPACrud;

@SuppressWarnings("serial")
@PersistenceController
public class AulaDAO extends JPACrud<Aula, Long> {
}
