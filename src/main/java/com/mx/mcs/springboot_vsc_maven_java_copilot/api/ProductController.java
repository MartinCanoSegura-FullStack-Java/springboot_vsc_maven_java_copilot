package com.mx.mcs.springboot_vsc_maven_java_copilot.api;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.mcs.springboot_vsc_maven_java_copilot.model.Product;

@RestController
public class ProductController {
    
    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return Arrays.asList(new Product(1, "Product 1", "Description 1", 100),
                             new Product(2, "Product 2", "Description 2", 200),
                             new Product(3, "Product 3", "Description 3", 300));
    }

    public Product getProductById(int id) {
        return null;
    }

    public Product creProduct(Product product) {
        return null;
    }

    public Product updateProduct(Product product) {
        return null;
    }

    public void deleteProduct(int id) {
        
    }

    
}
