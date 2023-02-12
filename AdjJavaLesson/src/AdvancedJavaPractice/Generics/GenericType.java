package Generics;

public class GenericType <T>{

    private  T type;

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }

    public static void main(String[] args) {
        GenericType<String> obj1=new GenericType<>();
        obj1.setType("Generic Type");

        GenericType<String> obj2=new GenericType<>();
       // obj2.setType(65); compile error veriyor(alti kirmizi)

        GenericType<Integer> obj3 =new GenericType<>();
        obj3.setType(65);
        int int1= obj3.getType();
        System.out.println("int1 = " + int1);
    }
}
