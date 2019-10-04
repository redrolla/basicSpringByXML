package com.learningSpringAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Chamber {
    private Animal animal;
    private Tiger tiger;
    private Panther panther;

    public Chamber(Tiger tiger, Panther panther) {
        this.tiger = tiger;
        this.panther = panther;
    }

    @Autowired
    public Chamber(@Qualifier("panther") Animal animal){
        this.animal = animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void feedAnimal(){
        System.out.println(animal.getClass().getSimpleName()+" is eating");
    }

    public void feedAllAnimals(){
        if(animal != null) System.out.println(animal.getClass().getSimpleName()+" is eating");
        if(tiger != null) System.out.println(tiger.getClass().getSimpleName()+" is eating");
        if(panther != null) System.out.println(panther.getClass().getSimpleName()+" is eating");
    }
}
