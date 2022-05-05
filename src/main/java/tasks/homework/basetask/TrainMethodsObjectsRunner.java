package tasks.homework.basetask;

public class TrainMethodsObjectsRunner {

    public static void main(String[] args) {

        Mouse mouse = new Mouse("Минни", 5);
        Souce souce = new Souce("шоколадный", "коричневый");
        Bee bee = new Bee("женский", 2);
        Obstacle obstacle = new Obstacle("краш приложения", "критикал");
        Pineapple pineapple = new Pineapple("Королевский", 3.68);
        TrainMethodsObjects trainMethodsObjects = new TrainMethodsObjects();
        trainMethodsObjects.processSouce(souce);
        trainMethodsObjects.processMouse(mouse);
        trainMethodsObjects.processBee(bee);
        trainMethodsObjects.processObstacle(obstacle);
        trainMethodsObjects.processPineapple(pineapple);
    }
}
