package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import basicas.Autor;

public class AutorDAO {
	private EntityManager em;

	public AutorDAO(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql");
		em = emf.createEntityManager();
	}

	public void inserirAutor(Autor autor) {
		EntityTransaction tx = em.getTransaction();

		try {
			tx.begin();

			em.persist(autor);

			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}
	}

	
	public Autor consultarPorId(Integer id) {
		return em.find(Autor.class, id);
	}

	
	public void removerAutor(Autor autor) {
		EntityTransaction tx = em.getTransaction();

		try {
			tx.begin();

			em.remove(autor);

			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}
	}

	
	public void alterarAutor(Autor autor) {
		EntityTransaction tx = em.getTransaction();

		try {
			tx.begin();

			em.merge(autor);

			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}
	}
}
