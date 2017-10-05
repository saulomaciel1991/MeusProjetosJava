package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import basicas.Cliente;

public class ClienteDAO {
	private EntityManager em;

	public ClienteDAO(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql");
		em = emf.createEntityManager();
	}

	public void inserirCliente(Cliente cliente) {
		EntityTransaction tx = em.getTransaction();

		try {
			tx.begin();

			em.persist(cliente);

			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}
	}

	
	public Cliente consultarPorId(Integer id) {
		return em.find(Cliente.class, id);
	}

	
	public void removerCliente(Cliente cliente) {
		EntityTransaction tx = em.getTransaction();

		try {
			tx.begin();

			em.remove(cliente);

			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}
	}

	
	public void alterarCliente(Cliente cliente) {
		EntityTransaction tx = em.getTransaction();

		try {
			tx.begin();

			em.merge(cliente);

			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}
	}
}
