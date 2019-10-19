package com.codegym.views;

import com.codegym.controller.ProductController;
import com.codegym.model.Product;

import java.util.List;
import java.util.Scanner;

public class viewMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Manager Product:");
        ProductController productController = new ProductController();
        int choice;
        do {
            menu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    List<Product> productList = productController.getProducts();
                    for (Product product : productList) {
                        System.out.println("Id: " + product.getId() +
                                        " Name: " + product.getName() +
                                        " Price: " + product.getPrice() +
                                        " Status: " + product.getStatus() +
                                        " Description: " +product.getDescription()
                        );
                    }
                    break;
                }
                case 2: {
                    System.out.println("Add a new product:");
                    Product productObject = inputProduct();
                    productController.addProduct(productObject);
                    break;

                }

                case 3:{
                    System.out.println("Fix a product with ID = :  ");
                    int idInput = scanner.nextInt();
                    Product productObject = inputProduct();
                    productController.editProduct(idInput,productObject);
                    break;
                }
                case 4:
                {
                    System.out.println("Delete a product with ID = : ");
                    int idInput = scanner.nextInt();
                    productController.deleteProduct(idInput);
                    break;
                }
                case 5:
                {
                    System.out.println("Search: ");
                    scanner.nextLine();
                    String nameInput = scanner.nextLine();
                    Product p = productController.searchByName(nameInput);
                    if (p== null) {
                        System.out.println("Not found:"+nameInput);
                    } else {
                        System.out.println("Product:"+p);
                    }
                    break;
                }
                case 6:
                {
                    System.out.println("Sort price increase:");
                    productController.sortDescending();
                    break;
                }
                case 7:
                {
                    System.out.println("Sort price decrease:");
                    productController.sortAscending();
                    break;
                }
            }

        } while (choice != 0);
    }
    private static void menu() {
        System.out.println("1. Show product list.");
        System.out.println("2. Add new product.");
        System.out.println("3. Fix.");
        System.out.println("4. Delete.");
        System.out.println("5. Search by name.");
        System.out.println("6. Sort increase for price.");
        System.out.println("7. Sort decrease for price.");
        System.out.println("0. Exit");
        System.out.println("Choose one:");
    }

    private static Product inputProduct() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter ID:");
        int id = input.nextInt();
        input.nextLine();
        System.out.println("Enter Name:");
        String name = input.nextLine();
        System.out.println("Enter Price:");
        float price = input.nextFloat();
        input.nextLine();
        System.out.println("Enter status:");
        String status = input.nextLine();
        System.out.println("enter description:");
        String description = input.nextLine();

        Product product = new Product(id, name, price,status,description);
        return product;
    }
}
