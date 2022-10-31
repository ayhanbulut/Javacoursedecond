package Day_10;

public class MaxsimumArray {

    public static void main(String[] args) {

        int arr[][]={{12,36},{13,1},{3,2}};
    int dummy=0;
        for (int a[]:arr) {
            for (int b:a) {

                if(b>=dummy){
                    dummy=b;

                }

            }

        }  System.out.println("dummy = " + dummy);
    }
}
