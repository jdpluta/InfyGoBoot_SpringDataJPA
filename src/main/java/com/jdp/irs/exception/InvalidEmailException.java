package com.jdp.irs.exception;

/**
 *
 * 
 * 
 * This Exception is thrown from RegistrationService class with error
 * 
 * message RegistrationService.INVALID_EMAIL if the given
 * 
 * email is not matching the constraints given in the regular expression.
 *
 * 
 * 
 * @author ETA_JAVA
 *
 * 
 * 
 */
public class InvalidEmailException extends Exception {
	private static final long serialVersionUID = 1L;

	/**
	 *
	 * 
	 * 
	 * This Exception is thrown from RegistrationService class with error
	 * 
	 * message RegistrationService.INVALID_EMAIL if the given
	 * 
	 * email is not matching the constraints given in the regular expression.
	 *
	 * 
	 * 
	 * @author ETA_JAVA
	 *
	 * 
	 * 
	 */
	public InvalidEmailException(String message) {
		super(message);
	}
}