package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = context.getBean(Person.class);

        Dog dog = context.getBean(Dog.class);

        System.out.println(person.getName());
        System.out.println(dog.getName());
        System.out.println(person.getDog());


    }
}