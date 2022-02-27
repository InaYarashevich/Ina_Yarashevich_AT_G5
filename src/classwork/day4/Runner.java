package classwork.day4;

public class Runner {

    public static void main(String[] args) {

        Wheel[] wheels = {
                new Wheel(16, "summer"),
                new Wheel(16, "summer"),
                new Wheel(16, "summer"),
                new Wheel(16, "summer")};

        Wheel[] bikeWheels = {
                new Wheel(16, "summer"),
                new Wheel(16, "summer")};


        Car car = new Car("Polo", "red", 100, wheels);
        Car car2 = new Car("Reno", "blue", 90, wheels);
        Bike bike = new Bike(25, "green", "Jawa", bikeWheels);
        Boeing boeing = new Boeing("747");

        VehicleProcessor vehicleProcessor = new VehicleProcessor();

        vehicleProcessor.printInfoVehicle(car);
        vehicleProcessor.printInfoVehicle(bike);
        vehicleProcessor.printInfoBoeing(boeing);

        vehicleProcessor.startMovable(car);
        vehicleProcessor.startMovable(bike);
        vehicleProcessor.startMovable(boeing);

        vehicleProcessor.stopMovable(car);
        vehicleProcessor.stopMovable(bike);
        vehicleProcessor.stopMovable(boeing);

        vehicleProcessor.printMachineryDetails(car);
        vehicleProcessor.printMachineryDetails(bike);
        vehicleProcessor.printMachineryDetails(boeing);

        vehicleProcessor.startMovable(new Movable() {
            @Override
            public void start() {
                System.out.println("Boat has started");
            }

            @Override
            public void stop() {
                System.out.println("Boat has stopped");
            }
        });
    }
}
