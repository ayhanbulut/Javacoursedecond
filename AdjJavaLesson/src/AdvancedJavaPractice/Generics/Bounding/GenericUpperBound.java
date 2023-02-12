package Generics.Bounding;

public class GenericUpperBound <T extends Number>{

    private T[] numberArray;

    public GenericUpperBound(T[] numberArray) {
        this.numberArray = numberArray;
    }
    public double getAverage(){
        double sum=0;
        for (T t : numberArray) {

            sum+=t.doubleValue();//double tipine döndürüyor
        }
        double avg=sum/ numberArray.length;

        return avg;
    }

    public static void main(String[] args) {
        Integer[] intAray={2,4,7,33};
        Double[] doubleArray={2.4,5.7,6.8};

        GenericUpperBound <Integer> obj1=new GenericUpperBound<>(intAray);
        System.out.println("obj1.getAverage() = " + obj1.getAverage());


        GenericUpperBound <Double> obj2=new GenericUpperBound<>(doubleArray);
        System.out.println(obj2.getAverage());

    }
}
