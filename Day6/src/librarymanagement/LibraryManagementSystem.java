package librarymanagement;

import java.util.List;

public class LibraryManagementSystem {

    public static void manageLibraryItems(List<LibraryItem> items) {
        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable reservableItem = (Reservable) item;
                reservableItem.reserveItem();
                boolean available = reservableItem.checkAvailability();
                System.out.println("Availability: " + (available ? "Available" : "Not Available"));
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Book book = new Book("B101", "The Great Gatsby", "F. Scott Fitzgerald", "Fiction");
        Magazine magazine = new Magazine("M202", "National Geographic", "Various", "March 2025");
        DVD dvd = new DVD("D303", "Inception", "Christopher Nolan", "Christopher Nolan");

        List<LibraryItem> items = List.of(book, magazine, dvd);
        manageLibraryItems(items);
    }
}
