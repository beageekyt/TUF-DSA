package org.lld.creationalPattern.factoryMethod;

public class SMS implements Notification{
    @Override
    public void send() {
        System.out.println("SMS notification has been sent.");
    }
}
