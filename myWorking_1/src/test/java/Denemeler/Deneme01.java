package Denemeler;

public class Deneme01 {


    public static void main(String[] args) {


        pattern2(5);
    }
        public static void pattern1(int x){


            for (int i = 0; i <= x; i++) {

                for (int j = 0; j<i ; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        public static void pattern2(int y){

            for (int i = 0; i < y; i++) {

                for (int j = 1; j >=i-3; j--) {
                    System.out.print("row " );

                }
                System.out.println("col");
            }
        }
    public static void pattern3(int y){

        for (int i = 0; i < y; i++) {
            int z=y;
            for (int j = i+1; j <y; j++) {
                z--;
                System.out.print(z );
            }
            System.out.println(z-1);
        }
    }
    }

