package Day_10;

import java.util.Arrays;

public class MultiDimensionalArray {

    public static void main(String[] args) {



    String arr[][]={{"Learn"},{"java","it"},{"is","easy"}};
        for (String[] a:arr) {
            for (String u:a) {
                if(u.contains("a"))  {
                     System.out.println(u+" ");
                }
            }

    }

        int brr[][]={{12,54},{3,2,7},{21}};
        int sum=0;
        for (int[] e:brr) {
            for (int sm:e) {
              sum=sm+sum;

            }

        }

        System.out.println(sum);
}
}
