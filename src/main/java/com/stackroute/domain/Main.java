package com.stackroute.domain;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Main {
    public static void main(String args[])
    {
        //use ApplicationContext
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        Movie movieA=context.getBean("movieBean1",Movie.class);
        movieA.display();
    }
}
