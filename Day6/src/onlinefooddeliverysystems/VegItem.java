package onlinefooddeliverysystems;

public class VegItem extends FoodItem implements Discountable {
    private double discount = 0.0;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double total = getPrice() * getQuantity();
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
