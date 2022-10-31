package Denemeler;

public class Car {

    String model="BMW";
    int year=2007;
    int price=4500;
    public Car(){

        System.out.println("car costructor1");
    }

    public Car(int x, int y){

        System.out.println(x+y);
    }
    public Car(int year,int price, String model){
        this.year=year;
        this.price=price;
        this.model=model;

        System.out.println("Car Age = "+year+"  Car price = "+price+"  Car model = "+model);
    }
}
