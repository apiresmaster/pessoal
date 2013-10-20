package br.com.ebook.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


/**
 * @author alemell
 *Classe de utilidade para construção de metodos bem como outras funcionalidades para a JPA
 */
public class JpaUtil {

	private static final EntityManagerFactory emf =
			Persistence.createEntityManagerFactory("default");
	
	public static EntityManager getEntityManager(){
		return emf.createEntityManager();
	}
}
