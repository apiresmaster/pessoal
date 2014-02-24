package br.com.ebook.automovel;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.junit.Test;
import org.junit.runner.RunWith;

import br.com.ebook.entity.Automovel;
import br.com.ebook.util.JpaUtil;
import br.com.ebook.util.WeldJUnit4Runner;

@RunWith(WeldJUnit4Runner.class)
public class AutomovelTest {

	@Inject
	private Automovel auto;
	@Inject
	private Automovel auto2;
	@Inject
	private Automovel auto3;
	
	private EntityManager em = JpaUtil.getEntityManager();
	
	@Test
	public void testarConexao(){
		
		auto.setAnoFabricacao(2012);
		auto.setModelo("Gol g3");
		auto.setObservacoes("Este vou excluir");

		auto2.setAnoFabricacao(2013);
		auto2.setModelo("Focus");
		auto2.setObservacoes("Acabou de ser batido");
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(auto);
		em.persist(auto2);
		tx.commit();
		em.close();
	}
	@Test
	public void obterAutomoveis(){
		Query qry = em.createQuery("select a from Automovel a", Automovel.class);
		List<Automovel> automoveis = qry.getResultList();
		for (Automovel a : automoveis){
			System.out.println(a.toString());
		}
	}
	
	@Test
	public void excluir(){
		auto3 = em.getReference(Automovel.class, 1);
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.remove(auto3);
		tx.commit();
		em.close();
	}
}
