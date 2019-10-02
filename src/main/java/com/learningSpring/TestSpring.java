package com.learningSpring;

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
         *          class="com.learningSpring.SpaceMarine">
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
         *         class="com.learningSpring.Listener"  >
         *         <constructor-arg ref="creature"/>
         *     </bean>
         */

        Listener listener = context.getBean("listener",Listener.class);

        listener.listen();

        context.close();
    }
}
