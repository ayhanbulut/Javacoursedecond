package Day_7;

import java.util.Scanner;

public class doWhile {


    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter the decimal number");

        double sc= input.nextDouble();

        String str=String.valueOf(sc);

       String decPart= str.split("")[1];

        System.out.println(decPart);

    }
}
