package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import basicas.Editora;

public class EditoraDAO {
	private EntityManager em;

	public EditoraDAO() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql");
		em = emf.createEntityManager();
	}

	public void inserirEditora(Editora editora) {
		EntityTransaction tx = em.getTransaction();

		try {
			tx.begin();

			em.persist(editora);

			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}
	}

	public Editora consultarPorId(Integer id) {
		return em.find(Editora.class, id);
	}

	public void removerEditora(Editora editora) {
		EntityTransaction tx = em.getTransaction();

		try {
			tx.begin();

			em.remove(editora);

			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}
	}

	public void alterarEditora(Editora editora) {
		EntityTransaction tx = em.getTransaction();

		try {
			tx.begin();

			em.merge(editora);

			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}
	}
}
