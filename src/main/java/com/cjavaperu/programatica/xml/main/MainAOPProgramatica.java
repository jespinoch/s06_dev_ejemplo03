package com.cjavaperu.programatica.xml.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cjavaperu.bean.Persona;
import com.cjavaperu.dao.PersonaDao;

public class MainAOPProgramatica {

	public static void main(String[] args) throws Exception {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicacionContextAOPProgramatica.xml");

		PersonaDao personaDao =  (PersonaDao) applicationContext.getBean("customerServiceProxy");

		personaDao.insertar(new Persona());
		//personaDao.actualizar(new Persona());
		//personaDao.eliminar(1);
		//personaDao.obtener(59);
		
	}

}
