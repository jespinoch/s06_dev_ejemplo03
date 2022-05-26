package com.cjavaperu.programatica.anotacion.aspecto;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

@Component
public class LoggingAspectoBefore implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] arg1, Object target) throws Throwable {
		System.out.println("before() esta ejecutandose!");
		System.out.println("before() método : " + method.getName());
	}

}
