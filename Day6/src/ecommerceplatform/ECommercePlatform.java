package ecommerceplatform;

import java.util.List;

public class ECommercePlatform {
    public static void calculateFinalPrice(List<Product> products) {
        for (Product product : products) {
            double discount = product.calculateDiscount();
            double tax = ((Taxable) product).calculateTax();
            double finalPrice = product.getPrice() + tax - discount;

            System.out.println("Product: " + product.getName());
            System.out.println("Original Price: " + product.getPrice());
            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);
            System.out.println(((Taxable) product).getTaxDetails());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Electronics laptop = new Electronics("E1001", "Laptop", 50000, 10);
        Clothing tShirt = new Clothing("C1001", "T-Shirt", 500, 15);
        Groceries rice = new Groceries("G1001", "Rice", 100, 5);

        List<Product> productList = List.of(laptop, tShirt, rice);
        calculateFinalPrice(productList);
    }
}
