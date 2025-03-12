package com.main;

import com.practice_Component.Vehicle;
import com.projectconfig.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Practice_Component {

    public static void main(String[] args) {

        var context= new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh1=context.getBean(Vehicle.class);

        System.out.println("Printing From Component Annotation"+veh1.getName());
        veh1.helloPrint();
    }
}
