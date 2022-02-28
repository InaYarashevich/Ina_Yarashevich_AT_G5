package main.java.tasks.homework.basetask;

public class TrainMethodsObjects {

    public void processMouse(Mouse mouse) {
        System.out.println(mouse);
        mouse.printMouseDetails();
    }

    public void processSouce(Souce souce) {
        System.out.println(souce);
        souce.printSouceDetails();
    }

    public void processBee(Bee bee) {
        System.out.println(bee);
        bee.printBeeDetails();
    }

    public void processObstacle(Obstacle obstacle) {
        System.out.println(obstacle);
        obstacle.printObstacleDetails();
    }

    public void processPineapple(Pineapple pineapple) {
        System.out.println(pineapple);
        pineapple.printPineappleDetails();
    }
}