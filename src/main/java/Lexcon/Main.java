package Lexcon;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer(1, "Anna", "anna@email.com");

        Product p1 = new Product(1, "Notebook", 5.0);
        Product p2 = new Product(2, "Pen", 2.0);
        Product p3 = new Product(3, "Backpack", 30.0);

        List<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);

        Order order = new Order(1, customer, products);
        order.calculateTotalPrice();
        order.printSummary();
    }
}