package basetask;

public class TrainMethodsObjects {

    public void processMouse(Mouse mouse) {

        System.out.println(mouse);
        mouse.printMouseDetails("Минни", 5);
    }

    public void processSouce(Souce souce) {

        System.out.println(souce);
        souce.printSouceDetails("шоколадный", "коричневый");
    }

    public void processBee(Bee bee){

        System.out.println(bee);
        bee.printBeeDetails(1);
    }

    public void processObstacle(Obstacle obstacle){

        System.out.println(obstacle);
        obstacle.printObstacleDetails("краш приложения", "критикал");
    }

    public void processPineapple(Pineapple pineapple){

        System.out.println(pineapple);
        pineapple.printPineappleDetails(3.68);
    }
}