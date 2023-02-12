package AdvancedJavaPractice.Generics.Classes.Methods;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GenericMethod
{

    public static void main(String[] args)
    {

String[] atdList={"Rafaeel","Donatello","Leonardo","Michelangelo"};
Double[]  pointList={95.6,35.6,66.89,76.0,46.0};
Character[] gradeList={'A','B','C','D'};

printArry(atdList);
printArry(pointList);
printArry(gradeList);

        System.out.println(Arrays.toString(orderArr(atdList)));
        System.out.println();
        System.out.println(Arrays.toString(orderArr(pointList)));
        System.out.println();




    }

    public static <T> void printArry(T[] array){
        for (T t:array) {
            System.out.print(t+" ");

        }
        System.out.println();

    }

    //-diziyi artan siralayan bir method yaziniz.
    public static <T extends Comparable<T>> T[] orderArr(T[] array){
        for (int i=0; i<array.length;i++){
            for (int j=i+1;j< array.length;j++){
                if (array[i].compareTo(array[j])>0)
                {
                    T temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
            }
        }
                    return array;

                }
}
