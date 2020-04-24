package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Product;

@RestController
public class ProductController {
	
	
	   List<Product> list=new ArrayList<Product>(); 
	   public ProductController() {
	   list.add(new Product(101,"Laptop",40500.00)); 
	   list.add(new Product(102,"IPad",90098.00)); 
	   list.add(new Product(103,"IPhone",90000.00));
	   list.add(new Product(104,"IPod",12000.00));
	   }
	 
	@RequestMapping("product")
	public String product()
	{
		return "product";
	}
	
	@PostMapping("/submit")
	public List<Product> saveProduct(Product toBeAdded)
	{
		 list.add(toBeAdded);
		 return list;
	}
}
