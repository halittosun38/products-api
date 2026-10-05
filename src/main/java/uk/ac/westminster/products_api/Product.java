package uk.ac.westminster.products_api;

public class Product {
    private Long id;
    private String name;
    // I would Notice that one of the fields is missing from json response
    private double price;

    public Product() {}

    public Product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
}