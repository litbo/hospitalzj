package com.litbo.hospitalzj.configurer;

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;

import com.litbo.hospitalzj.user.util.UserRealm;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import java.util.LinkedHashMap;
import java.util.Map;
@Configuration
public class  ShiroConfig {

    /**
     *   开启thymeleaf中使用shiro标签
     *
     *   @return
     **/
    @Bean
    public ShiroDialect shiroDialect(){
        return new ShiroDialect();
    }

    @Bean
    public ShiroFilterFactoryBean shiroFilter(SecurityManager securityManager){

        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();

        //设置SecurityManager
        shiroFilterFactoryBean.setSecurityManager(securityManager);

        //设置默认访问路径

        shiroFilterFactoryBean.setLoginUrl("/login.html");
        shiroFilterFactoryBean.setSuccessUrl("/admin/index.html");
        shiroFilterFactoryBean.setUnauthorizedUrl("/unauthorized.html");

        //过滤器
        Map<String,String> filterChainDefinitionMap = new LinkedHashMap<String, String>();


        filterChainDefinitionMap.put("/hospital/**","anon");


        filterChainDefinitionMap.put("/static/css/**","anon");
        filterChainDefinitionMap.put("/static/echarts/**","anon");
        filterChainDefinitionMap.put("/static/images/**","anon");
        filterChainDefinitionMap.put("/static/js/**","anon");
        filterChainDefinitionMap.put("/static/layui/**","anon");
        filterChainDefinitionMap.put("/static/less/**","anon");
        filterChainDefinitionMap.put("/static/webfonts/**","anon");
        filterChainDefinitionMap.put("/static/**","anon");
        filterChainDefinitionMap.put("/logout", "logout");


        filterChainDefinitionMap.put("/**","authc");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);


        return shiroFilterFactoryBean;
    }
    @Bean
    public SecurityManager securityManager(){
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();

        //设置Realm
        securityManager.setRealm(userRealm());
        return securityManager;

    }

    @Bean
    public UserRealm userRealm() {

        UserRealm userRealm =new UserRealm();
        return userRealm;
    }


    /**
     * Shiro 生命周期处理器
     *
     * @return
     **/
    @Bean
    public LifecycleBeanPostProcessor lifecycleBeanPostProcessor(){
        return  new LifecycleBeanPostProcessor();
    }



    /**
     *   开启Shiro的注解(如@RequiresRoles,@RequiresPermissions),需借助SpringAOP扫描使用Shiro注解的类,并在必要时进行安全逻辑验证
     *   配置以下两个bean(DefaultAdvisorAutoProxyCreator(可选)和AuthorizationAttributeSourceAdvisor)即可实现此功能
     *   @return
     **/
    @Bean
    @DependsOn("lifecycleBeanPostProcessor")
    public DefaultAdvisorAutoProxyCreator advisorAutoProxyCreator(){
        DefaultAdvisorAutoProxyCreator advisorAutoProxyCreator =new DefaultAdvisorAutoProxyCreator();
        advisorAutoProxyCreator.setProxyTargetClass(true);
        return advisorAutoProxyCreator;
    }

    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(SecurityManager securityManager){
        AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor =new AuthorizationAttributeSourceAdvisor();
        authorizationAttributeSourceAdvisor.setSecurityManager(securityManager);
        return authorizationAttributeSourceAdvisor;
    }



}
