package com.learningSpringXML;

public class ChickenFromFactory implements Creature {
    @Override
    public String roar() {
        return "cluck cluck";
    }

    /**
     * private constructor prohibits creation of new Instance with " = new class;"
     */
    private ChickenFromFactory(){

    }

    /**
     * factory method
     * needs to be static to be called on class, not on instance(which we want to create and doent yet exists)
     * if spring bean is singleton - spring will inject the same first object in "new method"
     */
    public static ChickenFromFactory getChickenFromFactoryInstance(){
        return new ChickenFromFactory();
    }
}
