package onlinefooddeliverysystems;

import java.util.List;

public class OrderProcessor {

    public static void processOrder(List<FoodItem> order) {
        double grandTotal = 0.0;

        for (FoodItem item : order) {
            item.getItemDetails();

            if (item instanceof Discountable) {
                Discountable discountableItem = (Discountable) item;
                discountableItem.getDiscountDetails();
            }

            double total = item.calculateTotalPrice();
            System.out.println("Total Price: $" + total);
            grandTotal += total;

            System.out.println();
        }

        System.out.println("Grand Total for the Order: $" + grandTotal);
    }

    public static void main(String[] args) {
        VegItem vegBurger = new VegItem("Veg Burger", 5.0, 2);
        vegBurger.applyDiscount(10); // Apply 10% discount

        NonVegItem chickenWings = new NonVegItem("Chicken Wings", 7.5, 3);
        chickenWings.applyDiscount(5); // Apply 5% discount

        List<FoodItem> order = List.of(vegBurger, chickenWings);
        processOrder(order);
    }
}
