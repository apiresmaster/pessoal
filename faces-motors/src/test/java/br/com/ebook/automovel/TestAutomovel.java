package br.com.ebook.automovel;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import junit.framework.TestCase;
import br.com.ebook.entity.Automovel;
import br.com.ebook.util.JpaUtil;

public class TestAutomovel extends TestCase {

	private EntityManager em = JpaUtil.getEntityManager();
	
	public void testCadastrarAutomovel(){
	
		Automovel a = new Automovel();
		a.setAnoFabricacao(2013);
		a.setAnoModelo(2013);
		a.setMarca("Fiat");
		a.setModelo("Gran Siena");
		a.setObservacoes("Inclusão do novo modelo da fiat");
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(a);
		tx.commit();
		em.close();
		
	}
}
