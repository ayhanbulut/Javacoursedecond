package Generics;

public class NoneGenericType {

    private Object o;

    public Object getO() {
        return o;
    }

    public void setO(Object o) {
        this.o = o;
    }

    public static void main(String[] args) {
        NoneGenericType obj1=new NoneGenericType();
        NoneGenericType obj2=new NoneGenericType();
        obj1.setO("Mirac");
        obj2.setO(65);

        String str1=(String) obj1.getO();
        System.out.println(str1);
        String str2= (String) obj2.getO();//Run Time Exceptions (RTE),Compile Time Exceptions(CTE), ClassCastException
        //string.valueOf(obj2.getrO())
        //Integre.parseInt(String);
    }
}
