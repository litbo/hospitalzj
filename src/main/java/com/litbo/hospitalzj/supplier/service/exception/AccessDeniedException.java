package com.litbo.hospitalzj.supplier.service.exception;

/**
 * 访问被拒绝的异常
 */
public class AccessDeniedException extends ServiceException {

	private static final long serialVersionUID = -3828596725277638298L;

	public AccessDeniedException() {
		super();
	}

	public AccessDeniedException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public AccessDeniedException(String message, Throwable cause) {
		super(message, cause);
	}

	public AccessDeniedException(String message) {
		super(message);
	}

	public AccessDeniedException(Throwable cause) {
		super(cause);
	}

}
