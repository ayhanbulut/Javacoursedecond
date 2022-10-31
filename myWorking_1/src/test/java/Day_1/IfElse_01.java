package Day_1;

import java.util.Scanner;

public class IfElse_01 {

    public static void main(String[] args) {

        //1. step creat scanner object
        Scanner input = new Scanner(System.in);

        //2.Give message to zhe user
        System.out.println("Enter a Number");

        //3.create the container according to data type
        int age = input.nextInt();

        if (age <= 0) {
            System.out.println("Please enter the correct number");
        }
        else if (age > 0 &&  age <= 4) {
            System.out.println("baby");
        }
        else if (age >= 5 &&  age <= 12) {
            System.out.println("Child");
        }
        else if (age >= 13 && age <= 20) {
            System.out.println("Teenager");
        }
        else if (age >= 21 && age <= 30) {
            System.out.println("adult");
        }
        else {
            System.out.println("old");
        }
    }
}