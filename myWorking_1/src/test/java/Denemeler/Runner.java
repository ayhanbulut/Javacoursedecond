package Denemeler;

import java.awt.*;

public class Runner {

    public static void main(String[] args) {

    Car C1=new Car(4,7);

        System.out.println("---------");

  Car bmw=new Car(2020,7500,"Ford");

bmw.year=2010;
        System.out.println(bmw.year);

        System.out.println("---------");
        Car C=new Car();
        System.out.println(C.year);
        System.out.println(C.model);
        System.out.println(C.price);
        System.out.println("---------");

    }
}
