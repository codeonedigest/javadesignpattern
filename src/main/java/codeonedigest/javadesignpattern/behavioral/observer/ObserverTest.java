package codeonedigest.javadesignpattern.behavioral.observer;

public class ObserverTest {
    public static void main(String args[]) {

        boolean eventOccured = false;

        Notifier notifier = new Notifier();

        Notification emailNotification = new EmailNotification();
        Notification smsNotification = new SmsNotification();

        notifier.addNotification(emailNotification);
        notifier.addNotification(smsNotification);

        eventOccured = true;

        if (eventOccured) {
            notifier.sendAllNotifications();
        }
    }
}
