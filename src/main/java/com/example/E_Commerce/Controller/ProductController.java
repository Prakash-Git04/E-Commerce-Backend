package com.example.E_Commerce.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.E_Commerce.Entity.ProductDetails;
import com.example.E_Commerce.Service.ProductService;

@RestController

public class ProductController {
	
	
	    @Autowired
	    ProductService productServ;

	    @PostMapping("/addproduct")
	    public ProductDetails addProduct(@RequestBody ProductDetails product) {
	        return productServ.addProduct(product);
	    }

	    @GetMapping("/allProduct")
	    public List<ProductDetails> getAllProducts() {
	        return productServ.getAllProducts();
	    }

	    @GetMapping("/getproduct/{id}")
	    public Optional<ProductDetails> getProductById(@PathVariable Long id) {
	        return productServ.getProductById(id);
	    }

	    @PutMapping("/updateProduct")
	    public ProductDetails updateProduct(
	            @RequestBody ProductDetails product) {

	        return productServ.updateProduct( product);
	    }

	    @DeleteMapping("/delete/{id}")
	    public String deleteProduct(@PathVariable Long id) {
	    	productServ.deleteProduct(id);
	        return "Product deleted successfully";
	    }
	}


