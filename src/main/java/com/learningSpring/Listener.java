package com.learningSpring;

import java.util.ArrayList;
import java.util.List;

public class Listener {
    private Creature creature;

    public List<Creature> getCreatures() {
        return creatures;
    }

    public void setCreatures(List<Creature> creatures) {
        this.creatures = creatures;
    }

    private List<Creature> creatures = new ArrayList<>();

    private String name;
    private int volume;

    public Listener(){}

    public Listener(Creature creature) {
        this.creature = creature;
    }

    public void setCreature(Creature creature) {
        this.creature = creature;
    }

    public void listen(){
        System.out.println(creature.roar());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
