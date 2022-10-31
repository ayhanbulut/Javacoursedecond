package Day_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List02 {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);

        System.out.println("Please enter the a letter");

        String sc=scr.nextLine();
          sc= sc.toUpperCase();

        List<String> gtIt=new ArrayList<>();

        gtIt.add("A");
        gtIt.add("C");
        gtIt.add("D");
        gtIt.add("F");

        if(gtIt.contains(sc)){
            gtIt.set(gtIt.indexOf(sc),"got it");
        }else{
            gtIt.add(sc);
        }
        System.out.println(gtIt);
    }
}
