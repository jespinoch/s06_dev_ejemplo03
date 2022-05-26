package com.cjavaperu.programatica.anotacion.aspecto;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.stereotype.Component;

@Component
public class LoggingAspectoAfter implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] arg2, Object target) throws Throwable {
		System.out.println("afterReturning() esta ejecutandose!");
		System.out.println("afterReturning() método : " + method.getName());
		System.out.println("afterReturning() respuesta : " + returnValue);
	}

}
