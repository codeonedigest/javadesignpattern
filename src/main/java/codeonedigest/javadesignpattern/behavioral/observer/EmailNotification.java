package codeonedigest.javadesignpattern.behavioral.observer;

public class EmailNotification implements Notification{
    @Override
    public void sendNotification() {
        System.out.println("Sent Email Notification");
    }
}
