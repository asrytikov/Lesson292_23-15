package org.example;

import org.springframework.stereotype.Component;

@Component
public class Dog {

    private String name;

    public Dog() {
        System.out.println("Dog created");
        name = "Tuzik";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
