package Day_11;


import javax.swing.text.Element;
import java.util.ArrayList;
import java.util.List;

public class ArrayList_02 {
    public static void main(String[] args) {

        List<String> lst=new ArrayList();

       lst.add("A ");
      lst.add("B");
        System.out.println("lst.iterator().hasNext() = " + lst.iterator().hasNext());
        String a=(lst.size()==0) ? "Array is empty:::":"Array is not empty::::";
        System.out.println(a);
            if(lst.size()==0){

                System.out.println("Array is empty");
            }
            else{
                System.out.println("Array is not empty");
            }

        for (String s : lst) {

            String obj=(s.contains(" ")) ? "It has space":"I has not space";

            System.out.println(obj);

        }

        }

        }


