// 21. Database Interface
// Problem: Interface Database with connect() and disconnect(). Implement in MySQLDatabase and OracleDatabase.
// Steps:
// 1.	Define interface.
// 2.	Implement in two classes.
// 3.	Test methods.

// DatabaseInterface.java

interface Database {
    void connect();
    void disconnect();
}

class MySQLDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Connecting to MySQL Database...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from MySQL Database...");
    }
}

class OracleDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Connecting to Oracle Database...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from Oracle Database...");
    }
}

public class DatabaseInterface {
    public static void main(String[] args) {
        Database mysql = new MySQLDatabase();
        Database oracle = new OracleDatabase();

        // Testing MySQL
        mysql.connect();
        mysql.disconnect();

        System.out.println("----------------");

        // Testing Oracle
        oracle.connect();
        oracle.disconnect();
    }
}
