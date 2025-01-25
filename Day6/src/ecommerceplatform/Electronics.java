package ecommerceplatform;

public class Electronics extends Product implements Taxable {
    private double discountPercentage;

    public Electronics(String productId, String name, double price, double discountPercentage) {
        super(productId, name, price);
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountPercentage / 100;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 18 / 100; // Example: 18% GST on Electronics
    }

    @Override
    public String getTaxDetails() {
        return "18% GST on Electronics";
    }
}
