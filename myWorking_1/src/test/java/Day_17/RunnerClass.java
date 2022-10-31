package Day_17;

public class RunnerClass {

    public static void main(String[] args) {

        Student std1=new Student();

        System.out.println("std1.stdName = " + std1.stdName);
        System.out.println("std1.stdGpa = " + std1.stdGpa);


        System.out.println("Student.staticStdName = " + Student.staticStdName);
        System.out.println("Student.staticStdGpa = " + Student.staticStdGpa);

    }
}
