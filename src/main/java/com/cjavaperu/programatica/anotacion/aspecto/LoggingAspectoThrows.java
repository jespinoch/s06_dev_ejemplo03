package com.cjavaperu.programatica.anotacion.aspecto;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.stereotype.Component;

@Component
public class LoggingAspectoThrows implements ThrowsAdvice {
	
	public void afterThrowing(IllegalArgumentException e) throws Throwable {
		System.out.println("afterThrowing() esta ejecutandose!");
		System.out.println("Exception : " + e.getMessage());
	}

}
