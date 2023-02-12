package Generics;

public class GenericTypeTwoParam <K,V>{


    private K k_;
    private V v;


    public GenericTypeTwoParam(K k_, V v) {
        this.k_ = k_;
        this.v = v;
    }

    public K getK_() {
        return k_;
    }

    public void setK_(K k_) {
        this.k_ = k_;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    public static void main(String[] args) {
        GenericTypeTwoParam<String, Integer> obj1= new GenericTypeTwoParam<>("java",1);
        GenericTypeTwoParam<Integer, String> obj2= new GenericTypeTwoParam<>(1,"SpringBoot");

        System.out.println("obj1.getK_() = " + obj1.getK_());
        System.out.println("obj2.getV() = " + obj2.getV());
    }
}
