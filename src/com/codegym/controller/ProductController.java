package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.ProductService;
import com.codegym.service.ProductServiceImpl;

import java.util.List;

public class ProductController {
    ProductService productService = new ProductServiceImpl();

    public List<Product> getProducts() {
        List<Product> productList = productService.findAll();
        if (productList.size() <= 0) {
            System.out.println("Không có sản phẩm nào.");
        }
        return productList;
    }

    public void addProduct(Product product){
        productService.add(product);
    }

    public void editProduct(int id, Product product) {
        productService.edit(id,product);
    }

    public void deleteProduct(int id){
        productService.remove(id);
    }
    public Product searchByName(String name){
        return productService.search(name);
    }

    public void sortDescending(){
        productService.sortDescending();
    }

    public void sortAscending(){
        productService.sortAscending();
    }

}
