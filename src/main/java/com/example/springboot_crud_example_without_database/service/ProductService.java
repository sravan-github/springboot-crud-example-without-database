package com.example.springboot_crud_example_without_database.service;


import com.example.springboot_crud_example_without_database.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot_crud_example_without_database.model.Product;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    public List<Product> getProducts() {
        return repository.getAllProducts();
    }

    public Product getProductById(int id) {
        return repository.findById(id);
    }

    public String deleteProduct(int id) {
        repository.delete(id);
        return "product removed !! " + id;
    }

    public Product updateProduct(Product product) {
       return repository.update(product);
    }
}