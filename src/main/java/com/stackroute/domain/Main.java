package com.stackroute.domain;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String args[])
    {
        //use ApplicationContext
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        Movie movieA=context.getBean("movieBean1",Movie.class);
        movieA.display();
    }
}
