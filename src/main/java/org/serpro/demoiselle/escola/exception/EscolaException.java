package org.serpro.demoiselle.escola.exception;

import javax.management.RuntimeErrorException;

import br.gov.frameworkdemoiselle.exception.ApplicationException;

@SuppressWarnings("serial")
@ApplicationException(rollback=true)
public class EscolaException extends RuntimeErrorException {

	public EscolaException(Error codErro) {
		super(codErro);
	}

	public EscolaException(Error erro, String argumento) {
		super(erro, argumento);
	}

}
