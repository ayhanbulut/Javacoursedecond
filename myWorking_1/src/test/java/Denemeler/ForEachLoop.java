package Denemeler;

public class ForEachLoop {


    public static void main(String[] args) {

        System.out.println(lolaBulut(5, 6));
        String dump="";
        int counter=0;
        String sc="I love java";

        for (int i=0; sc.length()==i ; i++){
            counter=0;
            System.out.println("1. adim");
            for (int j=0; j<=i; j++){

                if(sc.indexOf(i)==sc.indexOf(j)) {
                    counter++;
                    dump+=sc.charAt(j);
                    System.out.println("There ie"+counter+"="+dump);
                }
                System.out.println("There ie"+counter+"="+dump);
            }

        }
    }


    public static int lolaBulut(int a, int b){

        return a+b;
    }
}
