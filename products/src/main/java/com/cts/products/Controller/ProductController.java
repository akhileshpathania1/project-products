package com.cts.products.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.products.Service.ProductService;
import com.cts.products.model.Product;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@PostMapping("/add")
	public String add(@RequestBody Product product) {
		productService.saveProduct(product);
		return "New Customer is added";
	}
	@GetMapping("/getAll")
	public List<Product> getProduct(){
		return productService.getAllProducts();
	}
}