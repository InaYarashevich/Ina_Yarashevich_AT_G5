package classwork.day4;

import java.util.Arrays;

public class Car extends Vehicle implements Movable{

    String model;
    Wheel[] wheels;

    public Car(String model, String color, int speed, Wheel[] wheels) {
        super (speed, color);
        this.model = model;
        this.wheels = wheels;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                ", wheels=" + Arrays.toString(wheels) +
                '}';
    }

    @Override
    public void start() {
        System.out.println("Car has started");
    }

    @Override
    public void stop() {
        System.out.println("Car has stopped");
    }
}