package Day_9;

import java.util.Arrays;

public class ZerosToEnd {
    public static void main(String[] args) {

        int arr[]={1,3,2,4,3,9,12,4};
        int endNum=12;

        int counterNum=0;
        int counter=0;
        int newArr[]=new int[arr.length];

        for (int a:arr) {

            if (a==endNum){
                counterNum++;
            }
            else if (a!=endNum){
                newArr[counter]=a;
                counter++;
            }

        }
        System.out.println("There is /are "+ endNum+ " numbers "+ counterNum+ " times");

        System.out.println("1  "+ Arrays.toString(newArr));

        for (int i=counter; counter<arr.length; counter++){

             newArr[counter]=endNum;

        }
        System.out.println("2  "+Arrays.toString(newArr));
    }
}
