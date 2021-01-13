package com.ironbank.ironbankstarter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "raven")
public class RavenProps {

    private String destination;
}
