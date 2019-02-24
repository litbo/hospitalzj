package com.litbo.hospitalzj.configurer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.litbo.hospitalzj.interceptor.LoginInterceptor;



@Configuration
public class WebAppConfigurer 
	implements WebMvcConfigurer {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// 黑名单
		List<String> pathPatterns= new ArrayList<>();
		pathPatterns.add("/web/**");
		pathPatterns.add("/address/**");
		pathPatterns.add("/cart/**");
		// 白名单
		List<String> excludePathPatterns= new ArrayList<>();
		excludePathPatterns.add("/user/login");
		excludePathPatterns.add("/web/index.html");
		excludePathPatterns.add("/web/register.html");
		excludePathPatterns.add("/web/login.html");
		excludePathPatterns.add("/web/product.html");
		// 注册
		registry.addInterceptor(new LoginInterceptor()).addPathPatterns(pathPatterns).excludePathPatterns(excludePathPatterns);
	}

}
