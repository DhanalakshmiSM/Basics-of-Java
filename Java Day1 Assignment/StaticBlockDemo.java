class AppInfo {
    static String version;
    static String author;

    static {
        version = "1.0";
        author = "John Doe";
    }

    public static void displayInfo() {
        System.out.println("Version: " + version + ", Author: " + author);
    }
}

public class StaticBlockDemo {
    public static void main(String[] args) {
        AppInfo.displayInfo();
    }
}
