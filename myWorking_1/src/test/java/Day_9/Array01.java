package Day_9;

import java.util.Arrays;

public class Array01 {
    public static void main(String[] args) {

        int sc[]={1,5,9,11,15};
        int orc[]=new int[sc.length];
        int counter=0;

        for (int x:sc){
         if (x <=12){
             orc[counter]=x;
             counter++;

         }else{
             orc[counter]=x-10;
             counter++;
         }


        }
        System.out.println(Arrays.toString(orc));
    }
}
