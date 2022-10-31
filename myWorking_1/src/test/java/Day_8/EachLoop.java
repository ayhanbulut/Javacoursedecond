package Day_8;

import java.lang.reflect.Array;
import java.util.Arrays;

public class EachLoop {

    public static void main(String[] args) {
        double sum[]=new double[4];
        sum[0]=5.2;
        sum[1]=1.4;
        sum[2]=7.2;
        sum[3]=2.4;

        double add=0;
        for (double x:sum){
            add=add+x;
        }
        System.out.println(Arrays.toString(sum));
        System.out.println(Math.abs(add));

        Arrays.sort(sum);
        System.out.println(Arrays.toString(sum));
        System.out.println("--------");

        String sum1[]={"Ali","Mehmet","Ayhan","Selman","Said","Selim"};
        String dummy="";
        System.out.println(sum1[2]);
        System.out.println("--------");
        for (String f:sum1) {


            if(f.equals("Ayhan")){
             continue;
            // break;
            }
            System.out.println(f);
        }

    }
}
