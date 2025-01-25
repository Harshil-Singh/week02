package librarymanagement;

public class DVD extends LibraryItem implements Reservable {
    private String director;

    public DVD(String itemId, String title, String author, String director) {
        super(itemId, title, author);
        this.director = director;
    }

    @Override
    public int getLoanDuration() {
        return 5;  // DVDs are loaned for 5 days
    }

    @Override
    public void reserveItem() {
        System.out.println("Reserving the DVD: " + getTitle());
    }

    @Override
    public boolean checkAvailability() {
        // For simplicity, assume DVDs are always available
        return true;
    }

    // Getter and Setter for director
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
