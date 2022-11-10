package Day_22;

public class Exception02 {
    public static void main(String[] args) {

        String a[]={"A","B","C"};
        System.out.println("getElement(a,6) = " + getElement(a, 6));


    }
    public static String getElement(String a[],int idx){
        String m="";
        try {
            m=a[idx];

        }catch(ArrayIndexOutOfBoundsException e){

            System.out.println("There is bounadry problem");
            System.out.println("e.getMessage() = " + e.getMessage());
          e.printStackTrace();

        }
        return m;
    }

}
