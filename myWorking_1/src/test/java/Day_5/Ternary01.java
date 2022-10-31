package Day_5;

import java.util.Scanner;

public class Ternary01 {

    public static void main(String[] args) {

        int i=10;

       String result= (i>12 )? "THE INTEGER IS POSITIVE ": "THE INTEGER IS NOT POSITIVE";
        System.out.println(result);

        double d=2.4, e=2.3;
        double min=d>e ? e : d;

        System.out.println(min);



        int a=-2;
        int b=4;
        Object resultabs = a>0 && b >0 ? a*b: "please";
        System.out.println(resultabs);

    }
}
