package br.com.ebook.automovel;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import junit.framework.TestCase;
import br.com.ebook.entity.Automovel;
import br.com.ebook.util.JpaUtil;

public class TestAutomovel extends TestCase {

	private EntityManager em = JpaUtil.getEntityManager();
	
	/**
	 * Metodo que lista todos os automoveis cadastrados
	 */
	public void testListarTodosAutomoveis(){
		Query qr = em.createQuery("select a from Automovel a", Automovel.class);
		
		List<Automovel> automoveis = qr.getResultList();
		
		for (Automovel auto : automoveis){
			System.out.println("Dados do automovel: "+auto.toString());
		}
	}
	
	/**
	 * Metodo de exclusão de automovel
	 */
	public void testExcluirAutomovel(){
		Automovel del = em.getReference(Automovel.class, 2);
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.remove(del);
		tx.commit();
		em.close();
	}
	
	/**
	 * Metodo que realiza o cadastro de um automovel
	 */
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
		
		System.out.println("Automovel cadastrado: "+a.toString());
		
	}
}
