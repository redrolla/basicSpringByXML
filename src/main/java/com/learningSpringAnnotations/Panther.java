package com.learningSpringAnnotations;

import org.springframework.stereotype.Component;

@Component
public class Panther implements Animal {
    @Override
    public void roar() {
        System.out.println("MRAUR");
    }
}
