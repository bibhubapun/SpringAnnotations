package com.stackroute;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

public class Main
{
    public static void main( String[] args )
    {
        ConfigurableApplicationContext context= new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Movie movieA=context.getBean(Movie.class);
        movieA.display();

        Movie movieB=context.getBean(Movie.class);
        context.close();
    }
}
