package com.stackroute;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
    public static void main( String[] args )
    {
        ApplicationContext context= new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Movie movieA=context.getBean(Movie.class);
        movieA.display();

        Movie movieB=context.getBean(Movie.class);

        System.out.println(movieA==movieB);
    }
}
