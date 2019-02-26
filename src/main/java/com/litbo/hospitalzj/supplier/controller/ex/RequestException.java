package com.litbo.hospitalzj.supplier.controller.ex;

/**
 * 请求异常，是当前项目中控制器类抛出的异常的基类
 */
public class RequestException 
	extends RuntimeException {

	private static final long serialVersionUID = 1117101227251814290L;

	public RequestException() {
		super();
	}

	public RequestException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public RequestException(String message, Throwable cause) {
		super(message, cause);
	}

	public RequestException(String message) {
		super(message);
	}

	public RequestException(Throwable cause) {
		super(cause);
	}

}
