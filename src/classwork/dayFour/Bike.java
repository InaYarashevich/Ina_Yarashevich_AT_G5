package classwork.dayFour;

public class Bike extends Vehicle implements Movable {

    public Bike(int speed, String color) {
        super(speed, color);
    }

    @Override
    public void start() {
        System.out.println("Bike has started");
    }

    @Override
    public void stop() {
        System.out.println("Bike has stopped");
    }
}
