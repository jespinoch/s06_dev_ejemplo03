package com.cjavaperu.xml.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cjavaperu.bean.Persona;
import com.cjavaperu.dao.PersonaDao;

public class MainAOP {

	public static void main(String[] args) throws Exception {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicacionContextAOP.xml");

		PersonaDao personaDao =  (PersonaDao) applicationContext.getBean("personaDaoImpl");

		//personaDao.insertar(new Persona());
		//personaDao.actualizar(new Persona());
		personaDao.eliminar(1);
		//personaDao.obtener(55);
		
	}

}
