package com.litbo.hospitalzj.supplier.service.exception;

/**
 * 业务异常，是当前项目中所有业务异常的基类
 */
public class ServiceException extends RuntimeException {

	private static final long serialVersionUID = 5631578415492734367L;

	public ServiceException() {
		super();
	}

	public ServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public ServiceException(String message) {
		super(message);
	}

	public ServiceException(Throwable cause) {
		super(cause);
	}

}
