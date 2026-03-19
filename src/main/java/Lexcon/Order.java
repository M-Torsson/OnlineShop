package Lexcon;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    private Customer customer;
    private List<Product> products;
    private double totalPrice;
    private LocalDate orderDate;

    public Order(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
        this.products = new ArrayList<>();
        this.orderDate = LocalDate.now();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void calculateTotalPrice() {
        totalPrice = 0;

        for (Product product : products) {
            totalPrice += product.getPrice();
        }
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void printSummary() {
        System.out.println("Order ID: " + id);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Order Date: " + orderDate);

        System.out.println("Products:");
        for (Product p : products) {
            System.out.printf("- %s | Category: %s | Price: %.2f SEK%n",
                    p.getName(),
                    p.getCategory(),
                    p.getPrice());
        }

        System.out.println("Total Products: " + products.size());
        System.out.printf("Total Price: SEK %.2f%n", totalPrice);
    }
}