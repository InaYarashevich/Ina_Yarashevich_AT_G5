package tasks.classwork.day4;

public class VehicleProcessor {

    public void printInfoVehicle(main.java.tasks.classwork.day4.Vehicle vehicle) {
        System.out.println("Name is: " + vehicle.getName());
        System.out.println("Color is: " + vehicle.getColor());
        System.out.println("Speed is: " + vehicle.getSpeed());
        System.out.println("Model is: " + vehicle.getModel());
        System.out.println("Wheels # " + vehicle.getWheels().length);

        for (main.java.tasks.classwork.day4.Wheel wheel : vehicle.getWheels()) {
            System.out.println("---wheels drill down: ");
            System.out.println("wheel type is: " + wheel.getType());
            System.out.println("wheel diameter is: " + wheel.getDiameter());
        }
    }

    public void printMachineryDetails(main.java.tasks.classwork.day4.Machinery machinery){

        System.out.println("name is: " + machinery.getName());

        if (!(machinery instanceof main.java.tasks.classwork.day4.Plane)){
            System.out.println("name is: " + ((main.java.tasks.classwork.day4.Vehicle)machinery).getModel());
        }
    }

    public void printInfoBoeing(main.java.tasks.classwork.day4.Boeing boeing) {
        System.out.println("Name is: " + boeing.getName());
    }

    public void startMovable(main.java.tasks.classwork.day4.Movable movable) {
        movable.start();
    }

    public void stopMovable(main.java.tasks.classwork.day4.Movable movable) {
        movable.stop();
    }
}
