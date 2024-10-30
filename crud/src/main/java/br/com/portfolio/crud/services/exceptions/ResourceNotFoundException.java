package br.com.portfolio.crud.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object Id) {
		super("Não localizamos nenhum usuário com a id" + Id );
	}

}
