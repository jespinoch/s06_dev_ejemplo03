package com.cjavaperu.programatica.anotacion.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cjavaperu.bean.Persona;
import com.cjavaperu.dao.PersonaDao;
import com.cjavaperu.programatica.anotacion.config.AppConfig;

public class MainAOPProgramatica {

	public static void main(String[] args) throws Exception {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

		PersonaDao personaDao =  (PersonaDao) applicationContext.getBean("proxyFactory");

		personaDao.insertar(new Persona());
		//personaDao.actualizar(new Persona());
		//personaDao.eliminar(1);
		//personaDao.obtener(55);
		
	}

}
