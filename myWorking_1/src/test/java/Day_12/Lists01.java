package Day_12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Lists01 {
    public static void main(String[] args) {
//1. method
        HashSet<Integer> uniq=new HashSet<>();
        uniq.add(2);
        uniq.add(3);
        uniq.add(2);
        uniq.add(5);
        System.out.println(uniq);
//2.method
        List<Integer> uniq1=new ArrayList<>();
        uniq1.add(2);
        uniq1.add(3);
        uniq1.add(2);
        uniq1.add(5);
        uniq1.add(5);

        System.out.println("---------");

        uniq1 = uniq1.stream().distinct().collect(Collectors.toList());

        System.out.println(uniq1);

//3. method




        }
    }

