package com.learningSpring;

public class Listener {
    private Creature sound;

    public Listener(Creature sound) {
        this.sound = sound;
    }

    public void listen(){
        System.out.println(sound.roar());
    }
}
