package Day_11;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_1 {

    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        list2.add(12);
        list2.add(24);
        list2.add(1,30);
        System.out.println(list2);


        List<String> a=new ArrayList<>();
        a.add("A");
        a.add("B");

        List<String> b=new ArrayList<>();
        b.add("X");
        b.add("Y");
        b.add("Z");

        b.addAll(a);
        System.out.println(a);
        System.out.println(b);
    }
}
