package com.litbo.hospitalzj.supplier.service.exception;

/**
 * 违反了Unique约束的异常 
 */
public class DuplicateKeyException extends ServiceException {

	private static final long serialVersionUID = 1575222253909645563L;

	public DuplicateKeyException() {
		super();
	}

	public DuplicateKeyException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public DuplicateKeyException(String message, Throwable cause) {
		super(message, cause);
	}

	public DuplicateKeyException(String message) {
		super(message);
	}

	public DuplicateKeyException(Throwable cause) {
		super(cause);
	}

}
