package Day_18;

public class Honda extends Car {

    public void madeIn() {

        System.out.println("All marks must have Honda symbols");
    }

    public Honda() {

        System.out.println("it is coming from Honda class");
    }

    public Honda(boolean isNew) {
        super("Hybrid");
        if (isNew) {

            System.out.println("Brand new");
        } else {

            System.out.println("Used");
        }

    }
}
