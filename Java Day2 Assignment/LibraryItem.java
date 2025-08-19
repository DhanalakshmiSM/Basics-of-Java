class LibraryItem {
    String ID, title;

    LibraryItem(String ID, String title) {
        this.ID = ID;
        this.title = title;
    }

    void display() {
        System.out.println("ID: " + ID + ", Title: " + title);
    }
}

class Magazine extends LibraryItem {
    int issueNumber;
    String month;

    Magazine(String ID, String title, int issueNumber, String month) {
        super(ID, title);
        this.issueNumber = issueNumber;
        this.month = month;
    }

    void display() {
        super.display();
        System.out.println("Issue: " + issueNumber + ", Month: " + month);
    }

    public static void main(String[] args) {
        Magazine mag = new Magazine("M101", "Science Weekly", 12, "August");
        mag.display();
    }
}
