package com.cjavaperu.programatica.anotacion.aspecto;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

@Component
public class LoggingAspectoAround implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		
		System.out.println("invoke() esta ejecutandose!");
		System.out.println("invoke() método : " + methodInvocation.getMethod().getName());
		System.out.println("invoke() parametros : " + Arrays.toString(methodInvocation.getArguments()));

		System.out.println("invoke() antes de ejecutarse!");
	    Object result = methodInvocation.proceed();
	    System.out.println("invoke() despuesta de ejecutarse!");
	    return result;

	}

}
