package com.jdp.irs.exception;

/**
 *
 * 
 * 
 * This Exception is thrown from RegistrationService class with error
 * 
 * message RegistrationService.INVALID_NAME if the given
 * 
 * name is not matching the constraints given in the regular expression.
 *
 * 
 * 
 * @author ETA_JAVA
 *
 * 
 * 
 */
public class InvalidNameException extends Exception {
	private static final long serialVersionUID = 1L;

	/**
	 *
	 * 
	 * 
	 * This Exception is thrown from RegistrationService class with error
	 * 
	 * message RegistrationService.INVALID_NAME if the given
	 * 
	 * name is not matching the constraints given in the regular expression.
	 *
	 * 
	 * 
	 * @author ETA_JAVA
	 *
	 * 
	 * 
	 */
	public InvalidNameException(String message) {
		super(message);
	}
}