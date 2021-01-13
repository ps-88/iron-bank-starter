package com.ironbank.ironbankstarter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
@EnableConfigurationProperties(RavenProps.class)
@ConditionalOnProperty(name = "raven.destination")
public class IronBankStarterConf {


    @Bean
    public RavenSender ravenSender() {
        return new EmailRavenSender();
    }

    @Bean
//    @ConditionalOnProduction
    public ExceptionHandlerAspect aspect() {
        return new ExceptionHandlerAspect();
    }


}
