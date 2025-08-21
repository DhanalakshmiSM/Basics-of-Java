// LoggerInterfaceDemo.java
// 30. Logger Interface
// Problem: Interface Logger with log(String message). Implement in FileLogger and ConsoleLogger.
// Steps:
// 1.	Define interface.
// 2.	Implement logging in two classes.
// 3.	Print messages logged.


import java.io.FileWriter;
import java.io.IOException;

interface Logger {
    void log(String message);
}

class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Console Log: " + message);
    }
}

class FileLogger implements Logger {
    private String filename = "log.txt";

    @Override
    public void log(String message) {
        try (FileWriter writer = new FileWriter(filename, true)) {
            writer.write("File Log: " + message + "\n");
            System.out.println("Message logged to file: " + filename);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}

public class LoggerInterfaceDemo {
    public static void main(String[] args) {
        Logger console = new ConsoleLogger();
        Logger file = new FileLogger();

        // Test Console Logger
        console.log("Application started successfully.");
        console.log("User logged in.");

        System.out.println("---------------");

        // Test File Logger
        file.log("Application encountered an error.");
        file.log("Application closed.");
    }
}
