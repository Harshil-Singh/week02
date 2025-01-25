package librarymanagement;

public class Magazine extends LibraryItem implements Reservable {
    private String issueNumber;

    public Magazine(String itemId, String title, String author, String issueNumber) {
        super(itemId, title, author);
        this.issueNumber = issueNumber;
    }

    @Override
    public int getLoanDuration() {
        return 7;  // Magazines are loaned for 7 days
    }

    @Override
    public void reserveItem() {
        System.out.println("Reserving the magazine: " + getTitle());
    }

    @Override
    public boolean checkAvailability() {
        // For simplicity, assume magazines are always available
        return true;
    }

    // Getter and Setter for issueNumber
    public String getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber;
    }
}
