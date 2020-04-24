package com.cg.app.repo;

import java.util.List;

import com.cg.app.entity.Product;

public interface ProductRepoInterface {
	
	public void create(Product Pproduct);
	
	public List<Product> reterive();
	
	public Boolean delete(int id);

}
