package com.cjavaperu.anotacion.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cjavaperu.anotacion.config.AppConfig;
import com.cjavaperu.bean.Persona;
import com.cjavaperu.dao.PersonaDao;

public class MainAOP {

	public static void main(String[] args) throws Exception {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

		PersonaDao personaDao =  (PersonaDao) applicationContext.getBean("personaDaoImpl");

		personaDao.insertar(new Persona());
		//personaDao.actualizar(new Persona());
		//personaDao.eliminar(1);
		//personaDao.obtener(55);
		
	}

}
