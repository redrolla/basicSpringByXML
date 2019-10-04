package com.learningSpringAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
          "applicationContextForAnnotations.xml"
        );

        /**
         * Bean created via annotation @Component, BeanId, if class called Tiger, bean id = tiger
         * also Class.class can be a interface
         */
        /*Animal tiger1 = context.getBean("tiger",Animal.class);
        tiger1.roar();
*/
        System.out.println();
        //Chamber chamber = context.getBean("chamber",Chamber.class);
        //chamber.feedAnimal();
        //chamber.feedAllAnimals();

        Zoo zoo = context.getBean("zoo",Zoo.class);
        System.out.println(zoo.toString());

        context.close();
    }
}
