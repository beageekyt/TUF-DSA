package org.lld.creationalPattern.factoryMethod;

public class Teams implements Notification{
    @Override
    public void send() {
        System.out.println("Teams notification sent.");
    }
}
