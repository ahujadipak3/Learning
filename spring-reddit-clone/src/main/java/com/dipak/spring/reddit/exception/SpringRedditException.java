package com.dipak.spring.reddit.exception;

public class SpringRedditException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public SpringRedditException(Throwable cause) {
		super(cause);
	}
	
	public SpringRedditException(String errorMessage) {
		super(errorMessage);
	}
	
	public SpringRedditException(String errorMessage, Throwable cause) {
		super(errorMessage, cause);
	}
}
