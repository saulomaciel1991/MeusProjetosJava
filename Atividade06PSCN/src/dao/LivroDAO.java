package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import basicas.Livro;

public class LivroDAO {
	private EntityManager em;

	public LivroDAO() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql");
		em = emf.createEntityManager();
	}

	public void inserirLivro(Livro livro) {
		EntityTransaction tx = em.getTransaction();

		try {
			tx.begin();

			em.persist(livro);

			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}
	}

	public Livro consultarPorId(Integer id) {
		return em.find(Livro.class, id);
	}

	public void removerLivro(Livro livro) {
		EntityTransaction tx = em.getTransaction();

		try {
			tx.begin();

			em.remove(livro);

			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}
	}

	public void alterarLivro(Livro livro) {
		EntityTransaction tx = em.getTransaction();

		try {
			tx.begin();

			em.merge(livro);

			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}
	}
}
