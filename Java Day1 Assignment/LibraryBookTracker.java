class Book {
    String title;
    String author;
    static int totalBooks = 0;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        totalBooks++;
    }

    static void displayTotalBooks() {
        System.out.println("Total books in library: " + totalBooks);
    }
}

public class LibraryBookTracker {
    public static void main(String[] args) {
        new Book("The 5 AM Club", "Robin Sharma");
        new Book("Attitude is Everything", "Jeff Keller");
        Book.displayTotalBooks();
    }
}
