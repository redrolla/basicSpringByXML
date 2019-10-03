package com.learningSpring;

public class Boar implements Creature{
    @Override
    public String roar() {
        return "snort snort";
    }

    public void initMethod(){
        System.out.println(this.getClass().getSimpleName()+" initialized");
    }

    public void destroyMethod(){
        System.out.println(this.getClass().getSimpleName()+" destroyed");
    }
}
