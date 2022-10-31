package Day_5;

import java.util.Scanner;

public class NestedTernary {

    public static void main(String[] args) {
        /*
                Type java code by using nested ternary.
                Write a program to check if a year is "leap year" or not.
                i) If the year is divisible by 100 then it must be divisible by 400. ==> 1600+, 2000+, 1800-
                ii) If a year is not divisible by 100 then it must be divisible by 4. ==> 2004+, 1996+, 2021-
        */

        Scanner input=new Scanner(System.in);

        System.out.println("Enter the a year");

        int year=input.nextInt();

        System.out.println("Please give a positive number");

        int num= input.nextInt();
        String isLeap = year%100==0 ? (year%400==0 ? "Leap" : "Not leap") : (year%4==0 ? "Leap" : "Not leap");
        System.out.println(isLeap);

        /*
            Type code to check the password
            If it has more than 8 characters, initial should be 'i'
            If it has no more than 8 characters initial should be 'K'
            Solve the task by using nested-ternary
       */
        String pwd = "K123";
        String isValid = pwd.length()>8 ? (pwd.charAt(0)=='i' ? "Valid" : "Invalid") : (pwd.charAt(0)=='K' ? "Valid" : "Invalid");
        System.out.println(isValid);



        Object ob=num<0 ? (num> -10? num*-1: "please give a correct number"): (num<10? num*3: num*-3);

        System.out.println(ob);

    }
}
