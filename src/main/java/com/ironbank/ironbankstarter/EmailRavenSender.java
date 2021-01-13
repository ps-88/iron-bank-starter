package com.ironbank.ironbankstarter;

public class EmailRavenSender implements RavenSender {
    @Override
    public void sendRaven(String destination, RuntimeException ex) {
        System.out.println("Send to " + destination + " " + ex.getMessage());
    }
}
