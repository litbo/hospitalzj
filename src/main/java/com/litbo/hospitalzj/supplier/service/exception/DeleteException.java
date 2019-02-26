package com.litbo.hospitalzj.supplier.service.exception;

/**
 * 删除数据时异常
 */
public class DeleteException extends ServiceException {

	private static final long serialVersionUID = 4443953246778514588L;

	public DeleteException() {
		super();
	}

	public DeleteException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public DeleteException(String message, Throwable cause) {
		super(message, cause);
	}

	public DeleteException(String message) {
		super(message);
	}

	public DeleteException(Throwable cause) {
		super(cause);
	}

}
