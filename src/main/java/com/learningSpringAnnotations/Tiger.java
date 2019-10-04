package com.learningSpringAnnotations;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class Tiger implements Animal{
    @Override
    public void roar() {
        System.out.println("ROAR");
    }

    @PostConstruct
    public void initMethod(){
        System.out.println("***init method for "+this.getClass()+"***");
    }

    @PreDestroy
    public void destroyMethod(){
        System.out.println("***destroy method for "+this.getClass()+"***");
    }
}
