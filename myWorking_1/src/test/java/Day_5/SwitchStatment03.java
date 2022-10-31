package Day_5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SwitchStatment03 {

    public static void main(String[] args) {
        Scanner  input= new Scanner(System.in);
        System.out.println("Enter the number");
        byte monthNumber= input.nextByte();

        switch (monthNumber){

            case 1:
                System.out.println("january");
            case 2:
                System.out.println("February");
            case 3:
                System.out.println("March");
            case 4:
                System.out.println("April");
            case 5:
                System.out.println("May");
            case 6:
                System.out.println("june");
            case 7:
                System.out.println("July");
            case 8:
                System.out.println("August");
            case 9:
                System.out.println("September");
            case 10:
                System.out.println("October");
            case 11:
                System.out.println("November");
            case 12:
                System.out.println("December");
            break;
            default:
                System.out.println("Invalid month Number");

        }
    }
}
