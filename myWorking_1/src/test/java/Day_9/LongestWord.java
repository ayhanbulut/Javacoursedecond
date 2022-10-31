package Day_9;

import java.util.Arrays;

public class LongestWord {

    public static void main(String[] args) {

        String scn="buradaki en buyuk hayalim bumun";

        String scn1[]=scn.split(" ");

        System.out.println(Arrays.toString(scn1));

        String dummy="";

        for (String s : scn1) {


            if(dummy.length()<=s.length()){

                dummy=s;
            }
        }

        System.out.println(dummy);

    }
}
