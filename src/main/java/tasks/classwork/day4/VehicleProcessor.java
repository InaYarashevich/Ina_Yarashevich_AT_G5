package tasks.classwork.day4;

public class VehicleProcessor {

    public void printInfoVehicle(Vehicle vehicle) {
        System.out.println("Name is: " + vehicle.getName());
        System.out.println("Color is: " + vehicle.getColor());
        System.out.println("Speed is: " + vehicle.getSpeed());
        System.out.println("Model is: " + vehicle.getModel());
        System.out.println("Wheels # " + vehicle.getWheels().length);

        for (Wheel wheel : vehicle.getWheels()) {
            System.out.println("---wheels drill down: ");
            System.out.println("wheel type is: " + wheel.getType());
            System.out.println("wheel diameter is: " + wheel.getDiameter());
        }
    }

    public void printMachineryDetails(Machinery machinery){

        System.out.println("name is: " + machinery.getName());

        if (!(machinery instanceof Plane)){
            System.out.println("name is: " + ((Vehicle)machinery).getModel());
        }
    }

    public void printInfoBoeing(Boeing boeing) {
        System.out.println("Name is: " + boeing.getName());
    }

    public void startMovable(Movable movable) {
        movable.start();
    }

    public void stopMovable(Movable movable) {
        movable.stop();
    }
}
