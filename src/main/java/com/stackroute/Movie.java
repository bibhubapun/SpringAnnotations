package com.stackroute;

import org.springframework.beans.factory.annotation.Autowired;

public class Movie {
    @Autowired
    private Actor actor;
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void display(){
        System.out.println(actor.getName()+" "+actor.getGender()+" age:"+actor.getAge());
    }
}
