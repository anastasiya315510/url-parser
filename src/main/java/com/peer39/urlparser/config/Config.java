/*
 author Anastasiya
 created on 30/06/2023
 */


package com.peer39.urlparser.config;

import org.apache.commons.validator.routines.UrlValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * Config this is class using for create bean of UrlValidator
 *
 */
@Configuration
public class Config {


    /**
     Creates a bean for the {@link UrlValidator} class.
     The {@link UrlValidator} is used to validate URLs.
     @return an instance of {@link UrlValidator}
     */
    @Bean
    public UrlValidator validator() {

        return new UrlValidator();
    }
}
