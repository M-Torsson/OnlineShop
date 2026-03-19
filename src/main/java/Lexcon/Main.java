package Lexcon;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer(1, "Anna", "anna@email.com");

        Product p1 = new Product(1, "Notebook", 25.0, "Stationery");
        Product p2 = new Product(2, "Pen", 10.0, "Stationery");
        Product p3 = new Product(3, "Backpack", 350.0, "Bags");

        Order order = new Order(1, customer);

        order.addProduct(p1);
        order.addProduct(p2);
        order.addProduct(p3);

        order.calculateTotalPrice();
        order.printSummary();
    }
}