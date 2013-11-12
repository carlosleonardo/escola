package org.serpro.demoiselle.escola.persistence;

import org.serpro.demoiselle.escola.domain.Curso;
import br.gov.frameworkdemoiselle.stereotype.PersistenceController;
import br.gov.frameworkdemoiselle.template.JPACrud;

@SuppressWarnings("serial")
@PersistenceController
public class CursoDAO extends JPACrud<Curso, Long> {
}
