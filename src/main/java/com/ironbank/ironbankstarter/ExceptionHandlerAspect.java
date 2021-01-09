package com.ironbank.ironbankstarter;

import com.ironbank.ironbankstarter.exceptions.NotEnoughMoneyException;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class ExceptionHandlerAspect {

    @AfterThrowing(value = "execution(* com.example.ironbank2020.services.*.*(..))",throwing = "ex")
    public void sendRavenIfNotEnoughMoney(NotEnoughMoneyException ex) {
        System.out.println("raven fly");
    }
}
