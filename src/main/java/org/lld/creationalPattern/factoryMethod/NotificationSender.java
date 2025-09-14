package org.lld.creationalPattern.factoryMethod;

public class NotificationSender {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.getNotificationType("teams");
        notification.send();
        notification = notificationFactory.getNotificationType("sms");
        notification.send();
        notification = notificationFactory.getNotificationType("email");
        notification.send();
    }
}
