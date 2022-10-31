package Day_18;

public class Civic extends Honda {
    public void ecoEngine() {

        System.out.println("All civics have eco enginee");
    }

    public Civic() {

        System.out.println("it is coming from Civic class");
    }

    public Civic(int year) {
        super(true);
        System.out.println(year);
    }
}


