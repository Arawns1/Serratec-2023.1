package com.residencia.biblioteca.exception;

public class UploadArquivoException extends RuntimeException{
	
	//Comparativo de um @Id/Identidade -> Gera um identificador unico
	private static final long serialVersionUID = 1L;

	public UploadArquivoException() {
		super();
	}

	public UploadArquivoException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public UploadArquivoException(String message, Throwable cause) {
		super(message, cause);
	}

	public UploadArquivoException(String message) {
		super(message);
	}

	public UploadArquivoException(Throwable cause) {
		super(cause);
	}

	
}
