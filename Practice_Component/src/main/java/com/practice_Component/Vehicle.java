package com.practice_Component;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void helloPrint(){
        System.out.println("Printing Hi from Inside Component Bean Context");
    }
}
