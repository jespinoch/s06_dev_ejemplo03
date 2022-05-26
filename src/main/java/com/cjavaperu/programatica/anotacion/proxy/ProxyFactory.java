package com.cjavaperu.programatica.anotacion.proxy;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cjavaperu.dao.PersonaDao;

@Component
public class ProxyFactory extends ProxyFactoryBean {

	private static final long serialVersionUID = 1L;
	
	public ProxyFactory() {
	}
	
	@Autowired
	public ProxyFactory(PersonaDao personaDao) {
		System.out.println("personaDao: " + personaDao);
		super.setTarget(personaDao);
		String[] interceptorNames = {"loggingAspectoAround","loggingAspectoBefore"};
		super.setInterceptorNames(interceptorNames);
	}

}
