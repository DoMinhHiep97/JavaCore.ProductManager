package com.codegym.model;

public class Product {
    private int id;
    private String name;
    private float price;
    private String status;
    private String description;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", status='" + status + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public Product() {
    }

    public Product(int id, String name, float price, String status, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.status = status;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
