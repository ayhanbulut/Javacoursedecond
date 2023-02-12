package AdvancedJavaPractice.Generics.Classes;

public class StudentsLists
{


    public static void main(String[] args)
    {

        System.out.println("** Java Dersi Vize ve final notlari **");

        listGrade();
        System.out.println("## Kütüphane üye listesi ##");

        listMemberLibrary();
    }

    public static  void listGrade(){
 Student<String,Double,Double> std1=new Student("wilma",76.34,82.0);
 Student<String,Double,Double> std2=new Student("brad",90.34,84.0);
 Student<String,Double,Double> std3=new Student("barnie",56.34,82.0);

        System.out.printf("%-10s || %4s || %4s %n",std1.getS(),std1.getU(),std1.getV());
        System.out.printf("%-10s || %4s || %4s %n",std2.getS(),std2.getU(),std2.getV());
        System.out.printf("%-10s || %4s || %4s %n",std3.getS(),std3.getU(),std3.getV());


    }
    public static void listMemberLibrary(){
        Student<String, Integer,String> std1=new Student<>("Cakil",45,"cakil@gmail.com");
        Student<String, Integer,String> std2=new Student<>("haydi",32,"haydi@gmail.com");
        Student<String, Integer,String> std3=new Student<>("nar",23,"nar@gmail.com");
        System.out.printf("%-10s || %4d || %20s %n",std1.getS(),std1.getU(),std1.getV());
        System.out.printf("%-10s || %4d || %20s %n",std2.getS(),std2.getU(),std2.getV());
        System.out.printf("%-10s || %4d || %20s %n",std3.getS(),std3.getU(),std3.getV());

    }
}
