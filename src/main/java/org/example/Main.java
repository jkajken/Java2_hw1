package org.example;

import java.awt.*;

public class Main {
    public static void main(String[] args)
    {
       ToyShop toyShop = new ToyShop("ABC Mall", "Chuy ave 166");
       String[] movement = {"Sit","Cry",};
        Dolls doll = new Dolls("Masha", 1250, toyShop,ToyCategories.DOLLS,
                "Emotional Support",movement,Material.LDPE_HDPE);
        System.out.println(doll.getInfo());
        System.out.println("Sounds toy can make: ");
        doll.makeVoice();
        doll.makeVoice("crying sound");

        System.out.println("'''''''''''''''''''''''''''''''''''''''''");

        String[] movement2 = {"Spin","Fly"};
        Cars toyCar1 = new Cars("Albus300",6000,toyShop,ToyCategories.CARS_RADIO_CONTROLLED,
                "Physical activity",movement2,Material.polycarbonate_PC, Color.GREY);
        System.out.println(toyCar1.getInfo());
        System.out.println("Sounds toy can make: ");
        toyCar1.makeVoice("vroom vroom");

        System.out.println("'''''''''''''''''''''''''''''''''''''''''");


        String[] movement3 = {"Water spilling","Transforming"};
        Cars toyCar2 = new Cars("Fire Track",15000,toyShop,ToyCategories.CARS_RADIO_CONTROLLED,
                "Motor Skills",movement3,Material.polyvinylchloride_PVC,
                Color.RED);
        System.out.println(toyCar2.getInfo());
        System.out.println("Sounds toy can make: ");
        toyCar2.makeVoice("fire fire...");


    }

}