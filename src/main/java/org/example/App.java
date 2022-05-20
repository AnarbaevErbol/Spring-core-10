package org.example;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App{

    public static void main( String[] args ){

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Horse horse = context.getBean("horse",Horse.class);
        System.out.println(horse);

        Penguin penguin = context.getBean("penguin",Penguin.class);
        System.out.println(penguin);

        Person person = context.getBean("person",Person.class);
        System.out.println(person);

        Person person2 = context.getBean("person2",Person.class);
        System.out.println(person2);

        context.close();
    }
}
