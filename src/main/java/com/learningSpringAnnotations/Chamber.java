package com.learningSpringAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Chamber {
    private Animal animal;
    private Tiger tiger;
    private Panther panther;

    @Value("${chamber.length}")
    private int length;
    @Value("${chamber.width}")
    private int width;
    @Value("${chamber.heigth}")
    private int heigth;

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

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return heigth;
    }

    public int getVolume(){
        return getHeight()*getWidth()*getLength();
    }
}
