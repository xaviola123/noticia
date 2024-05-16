package com.curso.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class NoticiaTest {
	
	EntityManagerFactory emf;
	EntityManager em;
	
	
	@BeforeEach
	void iniciar() {
		emf=Persistence.createEntityManagerFactory("noticia");
		em=emf.createEntityManager();
	}
	
	@Test
	public void entityManagerFactoryTest() {
		
		assertNotNull(emf);
	}
	
	@Test
	public void entityManagerTest() {
		assertNotNull(em);
	}
	

}
