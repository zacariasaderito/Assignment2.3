package com.testString.testString;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "loan")
    public loanInterest getService()
    {
        return new underGrad("","", 5000.0);
    }

}
