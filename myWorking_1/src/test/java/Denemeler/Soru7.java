package Denemeler;

import java.util.Scanner;



public class Soru7 {

    public enum Seasons {
        WINTER, SUMMER, FALL, SPRING
    }

    public static void main(String[] args) {

    Scanner input= new Scanner(System.in);
        System.out.println("Enter a Season*s name");


        //String season=input.next().toUpperCase();

        Seasons s=Seasons.valueOf(input.next().toUpperCase());


        switch (s) {
            case WINTER:
                System.out.println("Snowboarding");
                break;
            case SUMMER :
                System.out.println("Fishing");
                break;
            case FALL:
                System.out.println("Trekking");
                break;
            case SPRING:
                System.out.println("Swimming");
                break;
            default:
                System.out.println("Code is not working");
        }

    }


}
