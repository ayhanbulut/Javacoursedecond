package Day_8;

import java.util.Arrays;
import java.util.Scanner;

public class AtoArray {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of students");
        int numOfStudent=sc.nextInt();
        String st[]=new String[numOfStudent];
        System.out.println(Arrays.toString(st));

        for (int i = 0; i <numOfStudent; i++) {
            System.out.println("Enter the Student Names");
            String names= sc.next();

            if (names.toLowerCase().contains("q")) {
            break;}
            else{
                st[i] = names;
            }

        }
        System.out.println(Arrays.toString(st));
    }
}
