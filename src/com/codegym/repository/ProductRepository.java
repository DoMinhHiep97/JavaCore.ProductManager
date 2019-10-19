package com.codegym.repository;

import com.codegym.model.Product;

public interface ProductRepository extends GeneralRepository<Product> {
    void add(Product product);

    void edit(int id, Product product);

    void remove(int id);

    Product search(String name);

    void sortDescending();

    void sortAscending();
}
