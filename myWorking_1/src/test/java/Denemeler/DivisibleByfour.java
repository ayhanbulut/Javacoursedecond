package Denemeler;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class DivisibleByfour {


    public static void main(String[] args) {


    Scanner input= new Scanner(System.in);

    System.out.println("Give one positive number");

    int num= input.nextInt();

        for(int i=0; i<=num; num--){

           Object number=num%4==0 && num%6==0 ? ("Ex Number" + num): ("Not ex number"+num);
            System.out.println(number);

            }

        }
    }


