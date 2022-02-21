package homework.bubbles;

public class Runner {
    public static void main(String[] args) {

        SparklingWater sparklingWater = new SparklingWater();

        Bottle bottle = new Bottle(0.5 );
        Bottle bottle2 = new Bottle(1 );
        Bottle bottle3 = new Bottle(1.5);

        bottle.open();
        bottle2.open();
        bottle3.open();
    }
}
