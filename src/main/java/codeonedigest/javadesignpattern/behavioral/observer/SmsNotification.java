package codeonedigest.javadesignpattern.behavioral.observer;

public class SmsNotification implements Notification{
    @Override
    public void sendNotification() {
        System.out.println("Sent Sms Notification");
    }
}
