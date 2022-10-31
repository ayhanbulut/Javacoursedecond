package Denemeler;

import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a sentence");
        String str=input.nextLine();
//substring
// finding character by using the substring
    String fStr=str.substring(0,1);
    String lastStr=str.substring(str.length()-1,str.length());
        System.out.println(fStr+lastStr);//result will be always string
        System.out.println(str);
//using char non-primitive dat type  finding first and last chars:

        char firstChar=str.charAt(0);
        char lastChar=str.charAt(str.length()-1);

        System.out.println(firstChar+lastChar);//result will be integer
        System.out.println(""+firstChar+lastChar);//result will be character

//how to find out what is first letter of name and surname
        String middleStr=str.split(" ")[1];
        System.out.println(middleStr);
        System.out.println(fStr+"."+(middleStr.substring(0,1))+"@gmail.com");

        //haw many words are there in the sentence?


        int numOfWords=str.split(" ").length;

        System.out.println(numOfWords);


    }
}
