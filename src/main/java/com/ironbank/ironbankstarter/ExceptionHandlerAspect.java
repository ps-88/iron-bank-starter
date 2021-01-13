package com.ironbank.ironbankstarter;

import com.ironbank.ironbankstarter.exceptions.NotEnoughMoneyException;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

@Aspect
public class ExceptionHandlerAspect {

    @Autowired
    private RavenSender ravenSender;

    @Value("${raven.destination}")
    private String destination;


    @AfterThrowing(value = "execution(* com.example.ironbank2020.services.*.*(..))",throwing = "ex")
    public void sendRavenIfNotEnoughMoney(NotEnoughMoneyException ex) {

        ravenSender.sendRaven(destination,ex);
    }
}
