package com.stackroute;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ApplicationConfig {
//    @Bean
//    public Actor getActor(){
//        Actor actor= new Actor();
//        actor.setAge(30);
//        actor.setName("Hrithik");
//        actor.setGender("male");
//        return actor;
//    }

    @Bean
    @Scope("prototype")
    public Movie getMovie(){
        Actor actor= new Actor();
        actor.setAge(30);
        actor.setName("Hrithik");
        actor.setGender("male");
        Movie movie=new Movie(actor);
        return movie;
    }
}
