package Generics.Bounding;

import java.util.ArrayList;
import java.util.List;

public class GenericLowerBoundAndWildCard {

    public static void main(String[] args) {

 List <Object> obj=new ArrayList<>();
 //addElemnts(obj);

 List <Number> obj2=new ArrayList<>();

 //addElemnts(obj2);



         printElement(new ArrayList<String>());


        printObj(new ArrayList<Object>());

 //List <Double> obj3=new ArrayList<>();
 // addElemnts(obj3); //CTE , Generic öncesi yapilarda RunTE olurdu.
    }
// super integerdan kasit bana integerin parent larini getir demek oluyor.
    public static void addElemnts(List< ? super Integer> list){
        //?: wildcard (Tipi bilinmeyen)
        for (int i = 0; i < 10; i++) {
              list.add(i);

        }
    }
    //Wildcard sinirlililari var.

    public static void printElement(List<?> listOfUnknown)
    {
        // listOfUnknown.add("java"); ? wildcard dolayi data türü netlesmede add methodu gibi islemleri yaptirmaz.

        for (Object ob : listOfUnknown)
        {

            System.out.println(ob);

        }
    }
        public static void printObj(List <Object> listOfUnknown) {
        // listOfUnknown.add("java"); ? wildcard dolayi data türü netlesmede add methodu gibi islemleri yaptirmaz.
        listOfUnknown.add("Java");

            for (Object o : listOfUnknown)
            {
                System.out.println(o);

            }

    }
    }

