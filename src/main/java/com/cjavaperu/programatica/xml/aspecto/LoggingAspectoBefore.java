package com.cjavaperu.programatica.xml.aspecto;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class LoggingAspectoBefore implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] arg1, Object target) throws Throwable {
		System.out.println("before() esta ejecutandose!");
		System.out.println("before() método : " + method.getName());
	}

}
