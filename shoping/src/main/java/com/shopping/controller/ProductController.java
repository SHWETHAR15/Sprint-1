package com.shopping.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.shoping.dto.ProductDTO;
import com.shoping.entity.Product;
import com.shoping.Service.productservice;
import jakarta.validation.Valid;

public class ProductController {
	//Constructor Injection
	@Autowired
	private ProductService productService;


	//Adds a new Product
	@PostMapping("/product")
	public ResponseEntity<Product> createBook(@RequestBody @Valid ProductDTO a)
	{

	    Product a1 = productService.createProduct(a);
	return new ResponseEntity<>(a1, HttpStatus.CREATED);

	}


	//Updates an Product based on their Id
	@PutMapping("/Product/{id}")
	public ResponseEntity<Product> updateproduct(@PathVariable("id") int id, @RequestBody ProductDTO productDTO)
	{

	ProductService.updateProduct(id, productDTO);
	return ResponseEntity.ok().body(ProductService.updateProduct(id, productDTO));

	}


	//Displays an product based on their name
	@GetMapping("/productsname")
	public ResponseEntity<List<product>> getproductByName(@RequestParam(required = false) String name)
	{

	List<product> product = productService.findByNameContaining(name);
	return ResponseEntity.ok(product);

	}

	//Displays an Product based on their Price
	@GetMapping("/Price")
	public ResponseEntity<List<Product>> getproductByPrice(@RequestParam(required = false) String price)
	{

	List<product> product= productService.findByPriceContaining(price);
	return ResponseEntity.ok(product);

	}

	//Displays an Product based on their ProductId
	@GetMapping("/products/{Productid}")
	public ResponseEntity<Product> getAllproductsbyproductId(@PathVariable int productid)
	{

	return ResponseEntity.ok().body(productService.getAllproductsByproductId(productid));

	}


	//Deletes an Product based on their productId
	@DeleteMapping("/products/{productid}")
	public ResponseEntity<Product> deleteProduct(@PathVariable int productid)
	{
	productService.deleteProduct(productid);
	return new ResponseEntity<>(HttpStatus.NO_CONTENT);

	}

	//Lists all the Products
	@GetMapping("/products")
	public ResponseEntity <List<Products>>fetchAllProducts()
	{

	List<product> product = productService.getAllProduct();
	return ResponseEntity.ok(product);

	}
	}


