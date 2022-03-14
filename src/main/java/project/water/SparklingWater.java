package main.java.project.water;

import main.java.project.water.Bubble;
import main.java.project.water.Water;

public class SparklingWater extends Water implements  Runnable{

    private boolean isOpened;
    private Bubble[] bubbles;


    public SparklingWater(String color, String transparency, String smell, int temperature) throws InterruptedException {
        super(color, transparency, smell, temperature);
        this.isOpened();
    }

    public void pump(Bubble[] bubbles) {
        this.bubbles = bubbles;
    }

    public void setOpened(boolean isOpened) {
        this.isOpened = isOpened;
        System.out.print("Set the Bottle as Opened ");
    }

    private void isOpened() {
        Thread thread = new Thread();
        thread.start();
    }

    private void degas() throws InterruptedException {

        int bubblesNumber = 10 + 5 * this.getTemperature();
        for (int i = 0; i < bubblesNumber; i++) {
            bubbles[i].cramp();
            bubbles[i] = null;
        }
        Thread.sleep(1000);
        System.out.print("Degas this sparkling water ");
    }

    public boolean isSparkle() {
        return bubbles[bubbles.length - 1] == null;
    }

    public Bubble[] getBubbles() {
        return bubbles;
    }

    public void setBubbles(Bubble[] bubbles) {
        this.bubbles = bubbles;
    }

    @Override
    public void mix() {

    }

    @Override
    public void run() {
        {
            while(!isOpened){
                System.out.println("Bottle is closed.");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            try {
                degas();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}