package Generics.Method;

public class GenericMethodDemo {

    public static void main(String[] args) {

        GenericMethodDemo obj1= new GenericMethodDemo();
        Integer[] intArray={1,23,54,56,45};
        Double[]   doubleArry={1.2,1.4,1.56};

        obj1.print(intArray);
        obj1.print(doubleArry);

/*
    }
    public void print(Integer[] arr){


    }
    public void print(Double[] db){

*/
    }


    public <T> void print(T[] array){
        for (T t : array) {
            System.out.println(t);

        }

    }
}
