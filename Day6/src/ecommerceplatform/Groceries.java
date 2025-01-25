package ecommerceplatform;

public class Groceries extends Product implements Taxable {
    private double discountPercentage;

    public Groceries(String productId, String name, double price, double discountPercentage) {
        super(productId, name, price);
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountPercentage / 100;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 2.5 / 100; // Example: 2.5% GST on Groceries
    }

    @Override
    public String getTaxDetails() {
        return "2.5% GST on Groceries";
    }
}
