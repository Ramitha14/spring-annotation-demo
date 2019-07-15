package com.stackroute.domain;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    //Movie Beans
    @Bean(name={"movieBeanA","movieBeanB"})
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Movie movieBean1() {
        Movie movie1 = new Movie();
        movie1.setActor(actorBean1());
        return movie1;
    }
    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Movie movieBean2()
    {
        Movie movie2=new Movie();
        movie2.setActor(actorBean2());
        return movie2;
    }
    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Movie movieBean3()
    {
        Movie movie3=new Movie();
        movie3.setActor(actorBean3());
        return movie3;
    }
    //Actor Beans
    @Bean
    public Actor actorBean1()
    {
        return new Actor("priya","female",21);

    }
    @Bean
    public Actor actorBean2()
    {
        return new Actor("swetha","female",22);

    }
    @Bean
    public Actor actorBean3()
    {
        return new Actor("gowtham","male",17);

    }

}