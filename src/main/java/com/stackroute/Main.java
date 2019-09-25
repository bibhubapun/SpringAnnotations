package com.stackroute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
    public static void main( String[] args )
    {
        ApplicationContext context= new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Movie movie=context.getBean(Movie.class);
        movie.display();
    }
}
