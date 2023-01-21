package codeonedigest.javadesignpattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Notifier {

    private List<Notification> notificationList = new ArrayList<>();

    public void addNotification(Notification notification) {
        notificationList.add(notification);
    }

    public void removeNotification(Notification notification) {
        notificationList.remove(notification);
    }

    public void sendAllNotifications() {
        for (Notification notification : notificationList) {
            notification.sendNotification();
        }
    }

}
