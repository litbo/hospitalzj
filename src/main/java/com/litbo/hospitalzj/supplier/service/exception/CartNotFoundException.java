package com.litbo.hospitalzj.supplier.service.exception;

/**
 * 购物车数据不存在的异常
 */
public class CartNotFoundException 
	extends ServiceException {

	private static final long serialVersionUID = -2366769358647402421L;

	public CartNotFoundException() {
		super();
	}

	public CartNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public CartNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public CartNotFoundException(String message) {
		super(message);
	}

	public CartNotFoundException(Throwable cause) {
		super(cause);
	}

}
