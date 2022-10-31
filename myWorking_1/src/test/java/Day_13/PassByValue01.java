package Day_13;

public class PassByValue01 {
    public static void main(String[] args) {

        int price=20;

        change(price);


        int b= change(price);

        System.out.println(price);
        //Pass by value
        System.out.println(b);
        //pass by reference
        price=b;
        System.out.println(price);

    }

    public static int change(int a){

        return a*2;
    }
}
