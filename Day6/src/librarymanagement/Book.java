package librarymanagement;

public class Book extends LibraryItem implements Reservable {
    private String genre;

    public Book(String itemId, String title, String author, String genre) {
        super(itemId, title, author);
        this.genre = genre;
    }

    @Override
    public int getLoanDuration() {
        return 14;  // Books are loaned for 14 days
    }

    @Override
    public void reserveItem() {
        System.out.println("Reserving the book: " + getTitle());
    }

    @Override
    public boolean checkAvailability() {
        // For simplicity, assume books are always available
        return true;
    }

    // Getter and Setter for genre
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
