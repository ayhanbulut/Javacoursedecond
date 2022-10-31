package Denemeler;

import java.util.Scanner;

public class RandomNAme {



    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter the your a number of which letter you prefer to start");
        int num=input.nextInt();
        String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        char smallAlphabet= alphabets.toLowerCase().charAt(num-1);
        char bigNumber=alphabets.charAt(num-1);
        System.out.println(bigNumber);
        System.out.println(smallAlphabet);

    }
}
