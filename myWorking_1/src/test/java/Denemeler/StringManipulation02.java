package Denemeler;

public class StringManipulation02 {

    public static void main(String[] args) {

        String str="i want to learn java";
        int idx=str.indexOf("java");
        System.out.println(idx+1);
        if(str.indexOf('a')==0){

            System.out.println("there is 'a' ");
        }else{

            System.out.println("there is no 'a' ");
        }

        //Example: Type code to check if a charcter is uniqe in a string or not
        //"Hello"==> h is unique, e is unique, o is unique

        //1.way
        String m="hello";

        String sc1=m.indexOf('h')==m.lastIndexOf('h') ? "Letter is unique":"Letter is not unique";

        System.out.println(sc1);

        //2.way

        if(m.indexOf('h')==m.lastIndexOf('h')){
            System.out.println("Letter is unique");
        }else{
            System.out.println("Letter is not unique");
        }

        //how many unique character are there?
         String dump="";

        int counter=0;
        String sc=str.replaceAll(" ","");
        System.out.println(sc);


    }
}
