package com.stackroute;


public class Movie {
    private Actor actor;

    public Movie(Actor actor) {
        this.actor = actor;
    }

    public void display(){
        System.out.println(actor.getName()+" "+actor.getGender()+" age:"+actor.getAge());
    }
}
