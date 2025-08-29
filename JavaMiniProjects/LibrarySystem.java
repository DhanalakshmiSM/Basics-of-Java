import java.io.*;
import java.util.*;

// ================= Custom Exceptions =================
class BookNotFoundException extends Exception {
    public BookNotFoundException(String msg) {
        super(msg);
    }
}
class MemberNotFoundException extends Exception {
    public MemberNotFoundException(String msg) {
        super(msg);
    }
}
class BookAlreadyIssuedException extends Exception {
    public BookAlreadyIssuedException(String msg) {
        super(msg);
    }
}

// ================= Book Base Class =================
class Book {
    protected int bookId;
    protected String title;
    protected String author;
    protected boolean isIssued;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    public void issueBook() throws BookAlreadyIssuedException {
        if (isIssued) throw new BookAlreadyIssuedException("Book already issued!");
        isIssued = true;
    }

    public void returnBook() {
        isIssued = false;
    }

    public int getBookId() {
         return bookId; 
        }
    public String getTitle() { 
        return title; 
    }
    public String getAuthor() { 
        return author; 
    }
    public boolean getIsIssued() {
         return isIssued;
     }

    @Override
    public String toString() {
        return bookId + ", " + title + ", " + author + ", " + isIssued;
    }
}

// ================= Special Book Types =================
class ReferenceBook extends Book {
    public ReferenceBook(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public void issueBook() throws BookAlreadyIssuedException {
        throw new BookAlreadyIssuedException("Reference books cannot be issued!");
    }
}

class EBook extends Book {
    private String downloadLink;

    public EBook(int id, String title, String author, String link) {
        super(id, title, author);
        this.downloadLink = link;
    }

    public String getDownloadLink() { return downloadLink; }

    @Override
    public String toString() {
        return super.toString() + ", Link: " + downloadLink;
    }
}

// ================= Member Class =================
class Member {
    private int memberId;
    private String name;
    private List<Integer> borrowedBooks;

    public Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(int bookId) {
        borrowedBooks.add(bookId);
    }

    public void returnBook(int bookId) {
        borrowedBooks.remove(Integer.valueOf(bookId));
    }

    public int getMemberId() { return memberId; }
    public String getName() { return name; }
    public List<Integer> getBorrowedBooks() { return borrowedBooks; }

    @Override
    public String toString() {
        return memberId + ", " + name + ", " + borrowedBooks;
    }
}

// ================= Library Manager =================
class Library {
    private HashMap<Integer, Book> books = new HashMap<>();
    private HashMap<Integer, Member> members = new HashMap<>();

    private static final String BOOKS_FILE = "books.txt";
    private static final String MEMBERS_FILE = "members.txt";
    private static final String TRANSACTIONS_FILE = "transactions.txt";

    public Library() {
        loadBooks();
        loadMembers();
    }

    // ========== Book Operations ==========
    public void addBook(String title, String author, String type, String link) {
        int id = books.size() + 101;
        Book book;
        if (type.equalsIgnoreCase("reference")) {
            book = new ReferenceBook(id, title, author);
        } else if (type.equalsIgnoreCase("ebook")) {
            book = new EBook(id, title, author, link);
        } else {
            book = new Book(id, title, author);
        }
        books.put(id, book);
        saveBooks();
        logTransaction("Book added: " + title + " (ID: " + id + ")");
        System.out.println("Book added successfully! ID: " + id);
    }

    public void viewBooks() {
        for (Book b : books.values()) {
            System.out.println(b);
        }
    }

    // ========== Member Operations ==========
    public void addMember(String name) {
        int id = members.size() + 501;
        Member m = new Member(id, name);
        members.put(id, m);
        saveMembers();
        logTransaction("Member registered: " + name + " (ID: " + id + ")");
        System.out.println("Member added successfully! ID: " + id);
    }

    public void viewMembers() {
        for (Member m : members.values()) {
            System.out.println(m);
        }
    }

    // ========== Issue / Return ==========
    public void issueBook(int memberId, int bookId) throws Exception {
        if (!members.containsKey(memberId)) throw new MemberNotFoundException("Member not found!");
        if (!books.containsKey(bookId)) throw new BookNotFoundException("Book not found!");

        Member m = members.get(memberId);
        Book b = books.get(bookId);

        b.issueBook();
        m.borrowBook(bookId);

        saveBooks();
        saveMembers();
        logTransaction("Member " + memberId + " issued Book " + bookId + " (" + b.getTitle() + ")");
        System.out.println("Book issued successfully!");
    }

    public void returnBook(int memberId, int bookId) throws Exception {
        if (!members.containsKey(memberId)) throw new MemberNotFoundException("Member not found!");
        if (!books.containsKey(bookId)) throw new BookNotFoundException("Book not found!");

        Member m = members.get(memberId);
        Book b = books.get(bookId);

        b.returnBook();
        m.returnBook(bookId);

        saveBooks();
        saveMembers();
        logTransaction("Member " + memberId + " returned Book " + bookId + " (" + b.getTitle() + ")");
        System.out.println("Book returned successfully!");
    }

    // ========== File Handling ==========
    private void saveBooks() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(BOOKS_FILE))) {
            for (Book b : books.values()) pw.println(b);
        } catch (IOException e) {
            System.out.println("Error saving books!");
        }
    }

    private void loadBooks() {
        try (BufferedReader br = new BufferedReader(new FileReader(BOOKS_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] p = line.split(", ");
                int id = Integer.parseInt(p[0]);
                String title = p[1];
                String author = p[2];
                boolean issued = Boolean.parseBoolean(p[3]);
                Book b = new Book(id, title, author);
                if (issued) b.issueBook();
                books.put(id, b);
            }
        } catch (Exception e) {
            System.out.println("No existing books found. Starting fresh.");
        }
    }

    private void saveMembers() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(MEMBERS_FILE))) {
            for (Member m : members.values()) pw.println(m);
        } catch (IOException e) {
            System.out.println("Error saving members!");
        }
    }

    private void loadMembers() {
        try (BufferedReader br = new BufferedReader(new FileReader(MEMBERS_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] p = line.split(", ");
                int id = Integer.parseInt(p[0]);
                String name = p[1];
                Member m = new Member(id, name);
                if (p.length > 2 && p[2].length() > 2) {
                    String listStr = p[2].replace("[", "").replace("]", "");
                    String[] arr = listStr.split(", ");
                    for (String s : arr) if (!s.isEmpty()) m.borrowBook(Integer.parseInt(s));
                }
                members.put(id, m);
            }
        } catch (Exception e) {
            System.out.println("No existing members found. Starting fresh.");
        }
    }

    private void logTransaction(String msg) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(TRANSACTIONS_FILE, true))) {
            pw.println(msg);
        } catch (IOException e) {
            System.out.println("Error logging transaction!");
        }
    }
}

// ================= Main Class =================
public class LibrarySystem {
    public static void main(String[] args) {
        Library lib = new Library();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Add Book");
            System.out.println("2. Add Member");
            System.out.println("3. View All Books");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. View Members");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            try {
                switch (ch) {
                    case 1:
                        sc.nextLine();
                        System.out.print("Enter Title: ");
                        String title = sc.nextLine();
                        System.out.print("Enter Author: ");
                        String author = sc.nextLine();
                        System.out.print("Enter Type (normal/reference/ebook): ");
                        String type = sc.nextLine();
                        String link = "";
                        if (type.equalsIgnoreCase("ebook")) {
                            System.out.print("Enter Download Link: ");
                            link = sc.nextLine();
                        }
                        lib.addBook(title, author, type, link);
                        break;

                    case 2:
                        sc.nextLine();
                        System.out.print("Enter Member Name: ");
                        String name = sc.nextLine();
                        lib.addMember(name);
                        break;

                    case 3:
                        lib.viewBooks();
                        break;

                    case 4:
                        System.out.print("Enter Member ID: ");
                        int mid = sc.nextInt();
                        System.out.print("Enter Book ID: ");
                        int bid = sc.nextInt();
                        lib.issueBook(mid, bid);
                        break;

                    case 5:
                        System.out.print("Enter Member ID: ");
                        int rmid = sc.nextInt();
                        System.out.print("Enter Book ID: ");
                        int rbid = sc.nextInt();
                        lib.returnBook(rmid, rbid);
                        break;

                    case 6:
                        lib.viewMembers();
                        break;

                    case 7:
                        System.out.println("Exiting Library System. Goodbye!");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice!");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
