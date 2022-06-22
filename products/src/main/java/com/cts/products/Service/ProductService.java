package com.cts.products.Service;
import java.util.List;

import com.cts.products.model.Product;

public interface ProductService {
	public Product saveProduct(Product product);
	public List<Product> getAllProducts();
}
