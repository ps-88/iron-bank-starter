package com.ironbank.ironbankstarter;

public interface RavenSender {
    void sendRaven(String destination, RuntimeException ex);
}
