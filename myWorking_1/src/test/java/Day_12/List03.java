package Day_12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class List03 {
    public static void main(String[] args) {

        List<Integer> a=new ArrayList<>();

        a.add(12);
        a.add(15);
        a.add(10);
        a.add(21);

        Collections.sort(a);
        int min=Integer.MAX_VALUE;

        for (int i = 1; i < a.size(); i++) {

            min=Math.min(min,a.get(i)- a.get(i-1));

        }
        System.out.println(min);

        for (int i = 1; i < a.size(); i++) {
            if(a.get(i)-a.get(i-1)==min){

                System.out.println(a.get(i)+" and "+a.get(i-1));
            }

        }
    }
}
