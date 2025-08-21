// NotificationInterfaceDemo.java
// 26. Notification InterfaceProblem: Interface Notification with send(). Implement in EmailNotification and SMSNotification.
// Steps:
// 1.	Define interface.
// 2.	Implement in two classes.
// 3.	Test send method.

interface Notification {
    void send(String message);
}

class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending Email Notification: " + message);
    }
}

class SMSNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS Notification: " + message);
    }
}

public class NotificationInterfaceDemo {
    public static void main(String[] args) {
        Notification email = new EmailNotification();
        Notification sms = new SMSNotification();

        // Test send method
        email.send("Your order has been shipped!");
        sms.send("Your OTP is 123456");
    }
}
