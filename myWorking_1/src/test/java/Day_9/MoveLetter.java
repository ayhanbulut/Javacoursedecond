package Day_9;

import java.util.Arrays;
/*

        int a=-2;
        int b=4;
        Object resultabs = a>0 && b >0 ? a*b: "please";
        System.out.println(resultabs);
*/

public class MoveLetter {
    public static void main(String[] args) {

        String str="I like to move it, move it";
        str=str.replaceAll(",","");
        System.out.println(str);


        String arr[]=str.split(" ");

        System.out.println(Arrays.toString(arr));
        int counter=0;
        String dummy[]=new String[arr.length];


               for (String a:arr){
                   if (a.startsWith("m")){

                   }
                   else if(a.isEmpty()){

                   }
                     else{
                    dummy[counter]=a;
                    counter++;
                   }

               }
        System.out.println("1----"+Arrays.toString(dummy));
        System.out.println(counter);

           }

       }

