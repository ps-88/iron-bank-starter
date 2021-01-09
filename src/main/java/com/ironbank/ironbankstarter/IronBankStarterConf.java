package com.ironbank.ironbankstarter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
public class IronBankStarterConf {


    @Bean
    public ExceptionHandlerAspect aspect(){
        return new ExceptionHandlerAspect();
    }


}
