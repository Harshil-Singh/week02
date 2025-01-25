package onlinefooddeliverysystems;

public class NonVegItem extends FoodItem implements Discountable {
    private double additionalCharge = 15.0; // Flat additional charge for non-veg items
    private double discount = 0.0;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double total = (getPrice() * getQuantity()) + additionalCharge;
        return total - (total * discount / 100); // Apply discount
    }

    @Override
    public void applyDiscount(double percentage) {
        this.discount = percentage;
    }

    @Override
    public void getDiscountDetails() {
        System.out.println("Discount applied: " + discount + "%");
    }
}
