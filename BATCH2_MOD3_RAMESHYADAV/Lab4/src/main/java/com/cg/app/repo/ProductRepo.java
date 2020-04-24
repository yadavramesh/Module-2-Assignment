package com.cg.app.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.app.entity.Product;


@Repository
public class ProductRepo implements ProductRepoInterface {

	@PersistenceContext
	EntityManager em;

	@Override
	public void create(Product product) {
		em.persist(product);
	}

	@Override
	public List<Product> reterive() {
		String Qstr = "SELECT product FROM PRODUCT product";
		TypedQuery<Product> query = em.createQuery(Qstr, Product.class);
		return query.getResultList();
	}

	@Override
	public Boolean delete(int id) {
		// TODO Auto-generated method stub
		Product product = em.find(Product.class, id);
		if(product!=null)
			{
			em.remove(product);
			return true;
			}
		return false;
	}
}
