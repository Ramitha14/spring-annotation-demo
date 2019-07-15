package com.stackroute.domain;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    //Movie Bean
    @Bean
    public Movie movieBean1()
    {
        return new Movie();
    }

    //Actor Bean
    @Bean
    public Actor actorBean1()
    {
        return new Actor("ram","male",30);

    }

}