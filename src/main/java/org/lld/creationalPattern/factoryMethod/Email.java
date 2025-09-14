package org.lld.creationalPattern.factoryMethod;

public class Email implements Notification{

    @Override
    public void send() {
        System.out.println("Email notification Sent.");
    }
}
