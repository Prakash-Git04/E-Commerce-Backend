package com.example.E_Commerce.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.E_Commerce.Entity.ProductDetails;
import com.example.E_Commerce.Repository.ProductDetailsRepository;


@Service
public class ProductService {
	
	
	    @Autowired
	    ProductDetailsRepository productRepo;

	   
	   
	    public ProductDetails addProduct(ProductDetails product) {
	        return productRepo.save(product);
	    }

	    public List<ProductDetails> getAllProducts() {
	        return productRepo.findAll();
	    }

	    public Optional<ProductDetails> getProductById(Long id) {
	        return productRepo.findById(id);
	    }

	    public ProductDetails updateProduct(ProductDetails product) {
		    
	        return productRepo.save(product);
	    }

	    public void deleteProduct(Long id) {
	        productRepo.deleteById(id);
	    }
	    

   }

