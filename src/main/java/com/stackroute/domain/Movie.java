package com.stackroute.domain;

public class Movie {
    public Actor actor;

    public void setActor(Actor actor) {
        this.actor = actor;
    }
    public void display()
    {
        System.out.println("Actor name is:"+actor.getName()+" Actor gender is:"+actor.getGender()+" Actor age is:"+actor.getAge());
    }

}