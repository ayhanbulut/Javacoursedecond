package Day_9;

import java.util.Arrays;

public class ArraySplit {

    public static void main(String[] args) {

        String date="29/12/1973";
        String arrDate[]=date.split("/");
        System.out.println(Arrays.toString(arrDate));
        System.out.println("Day "+ ":   "+arrDate[0]);
        System.out.println("Month "+ ": "+arrDate[1]);
        System.out.println("Year "+ ":  "+arrDate[2]);

    }
}
