package com.cjavaperu.xml.aspecto;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspectoXml {

	public void logBefore(JoinPoint joinPoint) {

		System.out.println("logBefore() esta ejecutandose!");
		System.out.println("logBefore() método : " + joinPoint.getSignature().getName());
	}

	public void logAfter(JoinPoint joinPoint) {

		System.out.println("logAfter() esta ejecutandose!");
		System.out.println("logAfter() método: " + joinPoint.getSignature().getName());

	}

	public void logAfterReturning(JoinPoint joinPoint, Object resultado) {

		System.out.println("logAfterReturning() esta ejecutandose!");
		System.out.println("logAfterReturning() método: "
				+ joinPoint.getSignature().getName());
		System.out.println("logAfterReturning() respuesta : " + resultado);

	}

	public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {

		System.out.println("logAfterThrowing() esta ejecutandose!");
		System.out.println("logAfterThrowing() método: " + joinPoint.getSignature().getName());
		System.out.println("Exception : " + error);

	}

	public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {

		System.out.println("logAround() esta ejecutandose!");
		System.out.println("logAround() método : " + joinPoint.getSignature().getName());
		System.out.println("logAround() parametros: " + Arrays.toString(joinPoint.getArgs()));
		System.out.println("logAround() antes de ejecutarse!");
		joinPoint.proceed(); // continua para interceptar al método
		System.out.println("logAround() despuesta de ejecutarse!");

	}

}
