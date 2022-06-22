package com.cts.products.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.products.Repository.ProductRepository;
import com.cts.products.model.Product;


@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductRepository productRepository;
	
	@Override
	public Product saveProduct(Product Product) {
		return productRepository.save(Product);
	}
	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}
}