package Day_6;

public class Random1 {

    public static void main(String[] args) {

        String st="12fgrfdgdGJLGIU34A";

        char ch=st.charAt(1);

        System.out.println(ch);
        System.out.println(st);
        String st1=st.replaceAll("[^A,f,G]","");
        System.out.println(st1);

       // double in=Double.valueOf(st1);

      //  System.out.println(in+2);
    }
}
