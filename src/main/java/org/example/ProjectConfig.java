package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example")
public class ProjectConfig {


   /* @Bean
    public Person person(){
        Person person = new Person();
        person.setName("Alex");
        person.setDog(dog());
        return person;
    }*/
   @Bean
   public Person person(Dog dog){
       Person person = new Person();
       person.setName("Alex");
       person.setDog(dog);
       return person;
   }


    /*@Bean
    public Dog dog(){
        Dog dog = new Dog();
        dog.setName("Reks");
        return dog;
    }*/


}
