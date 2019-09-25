package com.stackroute;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {

    @PostConstruct
    void afterMade(){
        System.out.println("Bean Constructed");
    }

    @PreDestroy
    void beforeDestroy(){
        System.out.println("Bean about to be destroyed");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean destroyed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean after properties are set");
    }
}
