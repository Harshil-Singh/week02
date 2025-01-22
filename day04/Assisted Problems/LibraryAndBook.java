import java.util.ArrayList;

// Book class
class Book {
    private String title;
    private String author;

    // Constructor to initialize book details
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getters for title and author
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // To print book details
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author;
    }
}

// Library class
class Library {
    private ArrayList<Book> books;

    // Constructor to initialize the books ArrayList
    public Library() {
        books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to display all books in the library
    public void displayBooks() {
        System.out.println("Books in the Library:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

public class LibraryAndBook {
    public static void main(String[] args) {
        // Creating Book objects
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee");

        // Creating Library objects
        Library library1 = new Library();
        Library library2 = new Library();

        // Adding books to the libraries
        library1.addBook(book1);
        library1.addBook(book2);

        library2.addBook(book3);

        // Displaying books in the libraries
        library1.displayBooks();
        library2.displayBooks();
    }
}
