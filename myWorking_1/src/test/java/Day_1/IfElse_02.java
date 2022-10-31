package Day_1;

import java.util.Scanner;

public class IfElse_02 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the name please");

        String name = scanner.nextLine();
      // String name1=name.toLowerCase().substring(0,name.length());
        String name2=name.toUpperCase().substring(0,1).concat(name.toLowerCase().substring(1,name.length()));
        //String name3=name2.concat(name1);


        System.out.println(name2);
    }
}
