package ecommerceplatform;

public class Clothing extends Product implements Taxable {
    private double discountPercentage;

    public Clothing(String productId, String name, double price, double discountPercentage) {
        super(productId, name, price);
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountPercentage / 100;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 5 / 100; // Example: 5% GST on Clothing
    }

    @Override
    public String getTaxDetails() {
        return "5% GST on Clothing";
    }
}
