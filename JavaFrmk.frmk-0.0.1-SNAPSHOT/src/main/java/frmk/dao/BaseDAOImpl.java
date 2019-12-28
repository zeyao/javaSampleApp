package frmk.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class BaseDAOImpl<E> implements BaseDAO<E> {
	
	@PersistenceContext
	protected EntityManager em;

	public E create(E e) {
		this.em.persist(e);
		return null;
	}

}
