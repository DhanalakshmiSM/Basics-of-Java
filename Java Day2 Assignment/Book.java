class Book {
    String title, author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

class EBook extends Book {
    double fileSize;
    String format;

    EBook(String title, String author, double fileSize, String format) {
        super(title, author);
        this.fileSize = fileSize;
        this.format = format;
    }

    void display() {
        super.display();
        System.out.println("File Size: " + fileSize + " MB, Format: " + format);
    }

    public static void main(String[] args) {
        EBook eb = new EBook("Java Programming", "James Gosling", 5.2, "PDF");
        eb.display();
    }
}
