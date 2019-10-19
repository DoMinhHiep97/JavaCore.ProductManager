package com.codegym.service;

import com.codegym.model.Product;
import com.codegym.repository.ProductRepository;
import com.codegym.repository.ProductRepositoryImpl;

import java.util.*;

public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository = new ProductRepositoryImpl();

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void add(Product product) {
        productRepository.add(product);
    }

    @Override
    public void edit(int id, Product product) {
        productRepository.edit(id, product);
    }

    @Override
    public void remove(int id) {
        productRepository.remove(id);
    }

    @Override
    public Product search(String name) {
        return productRepository.search(name);
    }

    @Override
    public void sortDescending() {
        productRepository.sortDescending();
    }

    @Override
    public void sortAscending() {
        productRepository.sortAscending();
    }


}
