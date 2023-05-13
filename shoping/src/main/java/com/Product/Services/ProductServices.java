package com.Product.Services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.shoping.dto.ProductDTO;
import com.shoping.entity.Product;
@Component


public interface ProductServices {
	//To get record of all the Product
	List<Product> getAllProduct();
	
	//To add a new Product
	Product createProduct(ProductDTO productDTO);
	
	//To update an Product using Id
	Product updateProduct(int id,ProductDTO productDTO);
	
	//To display an Product using Id
	Product getAllProductId(int id);
	
	//To display an Product using its name
	List<Product> findByNameContaining(String name);
	
	//To display an Product using its name
	List<Product> findByModelContaining(String author);
	
	//To delete an Product by its Id
	String deleteProduct(int id);

}
