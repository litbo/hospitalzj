package com.litbo.hospitalzj.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;

/**
 * 登录拦截器
 */
public class LoginInterceptor 
	implements HandlerInterceptor {
	
	@Override
	public boolean preHandle(
			HttpServletRequest request, 
			HttpServletResponse response, 
			Object handler)
			throws Exception {
		// 获取Session对象
		HttpSession session
			= request.getSession();
		// 判断Session中是否存在uid
		if (session.getAttribute("uid") == null) {
			// 为null，即没有uid，即没有登录
			response.sendRedirect("../web/login.html");
			// 拦截
			return false;
		} else {
			// 非null，即存在uid，即已经登录
			return true;
		}
	}

}
