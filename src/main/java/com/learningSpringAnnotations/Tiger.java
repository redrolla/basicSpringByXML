package com.learningSpringAnnotations;

import org.springframework.stereotype.Component;

@Component
public class Tiger implements Animal{
    @Override
    public void roar() {
        System.out.println("ROAR");
    }
}
