package Lexcon;

import java.util.List;

public class Order {
    private int id;
    private Customer customer;
    private List<Product> products;
    private double totalPrice;

    public Order(int id, Customer customer, List<Product> products) {
        this.id = id;
        this.customer = customer;
        this.products = products;
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

    public void printSummary() {
        System.out.println("Order ID: " + id);
        System.out.println("Customer: " + customer.getName());

        System.out.println("Products:");
        for (Product p : products) {
            System.out.println("- " + p.getName() + " : " + p.getPrice());
        }

        System.out.println("Total Products: " + products.size());
        System.out.println("Total Price: " + totalPrice);
    }
}