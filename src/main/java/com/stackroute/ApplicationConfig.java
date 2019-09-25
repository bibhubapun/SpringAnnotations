package com.stackroute;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean
    public Actor getActor(){
        Actor actor= new Actor();
        actor.setAge(30);
        actor.setName("Hrithik");
        actor.setGender("male");
        return actor;
    }

    @Bean
    public Movie getMovie(){
        return new Movie();
    }
}
