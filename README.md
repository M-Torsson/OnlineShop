# OnlineShop

This project is a simple online shop system built in Java for the OOP1 workshop.

## Project Description

The system includes three main classes:

- Customer
- Product
- Order

A customer can have an order, and an order can contain multiple products.  
The system calculates the total price of the order and prints a summary.

## Classes

### Customer
Represents a customer with:
- id
- name
- email

### Product
Represents a product with:
- id
- name
- price
- category

### Order
Represents an order with:
- id
- customer
- list of products
- total price
- order date

## Features

- Add products to an order
- Remove products from an order
- Calculate total price
- Print order summary
- Display product category
- Display order date

## Example Output

Order ID: 1  
Customer: Anna  
Order Date: 2026-03-19  
Products:
- Notebook | Category: Stationery | Price: 25.00 SEK
- Pen | Category: Stationery | Price: 10.00 SEK
- Backpack | Category: Bags | Price: 350.00 SEK  
  Total Products: 3  
  Total Price: 385.00 SEK

## Part 2 Improvements

For the optional part, the system was improved by adding:

- category in Product
- orderDate in Order
- addProduct() method
- removeProduct() method

These changes make the system more realistic and easier to extend.