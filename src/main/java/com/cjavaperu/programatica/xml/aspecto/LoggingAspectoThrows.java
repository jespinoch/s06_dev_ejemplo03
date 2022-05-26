package com.cjavaperu.programatica.xml.aspecto;

import org.springframework.aop.ThrowsAdvice;

public class LoggingAspectoThrows implements ThrowsAdvice {
	
	public void afterThrowing(IllegalArgumentException e) throws Throwable {
		System.out.println("afterThrowing() esta ejecutandose!");
		System.out.println("Exception : " + e.getMessage());
	}

}
