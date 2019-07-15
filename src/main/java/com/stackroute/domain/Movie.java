package com.stackroute.domain;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
public class Movie implements BeanFactoryAware, ApplicationContextAware, BeanNameAware {
    private Actor actor;
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException
    {
        System.out.println("Implementing BeanfactoryAware");
    }
    public void setApplicationContext(ApplicationContext applicationcontext) throws BeansException
    {
        System.out.println("Implementing ApplicationContextAware");
    }
    public void setBeanName(String str)
    {
        System.out.println("Implementing BeanName");
    }

    public Movie() {

    }
    public Movie(Actor actor) {
        this.actor = actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void display()
    {
        System.out.println("Actor name is:"+actor.getName()+" Actor gender is:"+actor.getGender()+" Actor age is:"+actor.getAge());
    }

}