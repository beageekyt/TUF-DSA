package org.lld.creationalPattern.factoryMethod;

public class NotificationFactory {
    public Notification getNotificationType(String type) {
        switch (type.toLowerCase()) {
            case "sms":
                return new SMS();
            case "email":
                return new Email();
            case "teams":
                return new Teams();
            default:
                throw new IllegalArgumentException("invalid notification Type");
        }
    }
}
