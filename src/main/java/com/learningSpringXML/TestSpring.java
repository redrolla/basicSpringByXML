package com.learningSpringXML;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        /**
         *  without Dependency Injection
         *  created Bean in context
         *  manualy create object Listener and manualy inject Bean into it
         *           <bean id="creature"
         *          class="com.learningSpringXML.SpaceMarine">
         *          </bean>
         */
        /*
        Creature creature = context.getBean("creature",Creature.class);
        Listener listener = new Listener(creature);
        */

        /**
         * with DI
         * created Beans of Creature and Listener in context, injected Creature in Listener via reference
         *     <bean id="listener"
         *         class="com.learningSpringXML.Listener"  >
         *         <constructor-arg ref="creature"/>
         *     </bean>
         */

        Listener listener = context.getBean("listener",Listener.class);
        listener.listen();


        /**
         * DI via setter and reference
         */
        Listener listenerViaSetter = context.getBean("listenerViaSetter",Listener.class);
        listenerViaSetter.listen();

        Listener listnerValues = context.getBean("listenerValues",Listener.class);
        listnerValues.listen();
        System.out.print(listnerValues.getName() + " " + listnerValues.getVolume() + "\n");

        Listener listenerViaProperties = context.getBean("listenerViaProperties",Listener.class);
        listenerViaProperties.listen();
        System.out.print(listenerViaProperties.getName() + " " + listenerViaProperties.getVolume() + "\n");

        /**
         * DI List
         */

        Listener listenerList = context.getBean("listenerList",Listener.class);
        System.out.println(listenerList.getCreatures());

        context.close();

        /**
         * Bean without scope has "singleton" scope by default, each time .getBean is called - the same object is returned
         * Bean with scope "prototype" returnes new object each time .getBean is called
         * WolfBean from context2 is prototype
         */

        ClassPathXmlApplicationContext context2 = new ClassPathXmlApplicationContext(
                "applicationContext2.xml"
        );

        Creature wolf1 = context2.getBean("WolfBean",Wolf.class);
        Creature wolf2 = context2.getBean("WolfBean",Wolf.class);
        System.out.println();
        System.out.println(wolf1);
        System.out.println(wolf2);
        System.out.println();

        /**
         * init-method calls method which you choose before creating a bean
         * destroy-method after context is closed
         * ! if bean is PROTOTYPE destroy-method is not called
         * init-method called for singleton bean once, for prototype - each type .getBean is called
         */

        Creature boar = context2.getBean("BoarBean",Boar.class);
        Creature boar2 = context2.getBean("BoarBean",Boar.class);
        System.out.println(boar.roar());

        Creature chicken = context2.getBean("ChickenBean",ChickenFromFactory.class);
        Creature chicken2 = context2.getBean("ChickenBean",ChickenFromFactory.class);
        System.out.println(chicken.roar() + " " + chicken);
        System.out.println(chicken2.roar()+ " " + chicken2);

        context2.close();

    }
}
