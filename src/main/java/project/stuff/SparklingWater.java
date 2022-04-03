package main.java.project.stuff;

import main.java.project.vessel.Vessel;

import java.util.ArrayList;
import java.util.List;

public class SparklingWater extends Water{

    private boolean isOpened;
    private List<Bubble> bubbles;
    private Vessel vessel;

    public SparklingWater(String color, String transparency, String smell, int temperature) {
        super(color, transparency, smell, temperature);
        List<Bubble> bubbles = new ArrayList<>();
        for (int i = 0; i < 10000 * vessel.getVolume(); i++) {
            bubbles.add(new Bubble("CO2"));
        }
        pump(bubbles);
        this.isOpened();
    }

    public void pump(List<Bubble> bubbles) {
        this.bubbles = bubbles;
    }

    public void setOpened(boolean isOpened) {
        this.isOpened = isOpened;
        System.out.println("Bottle is opened");
    }

    private void isOpened() {
        Thread thread = new Thread(() -> {

        while (!isOpened) {
            System.out.println("Bottle is closed.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            degas();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }});
        thread.start();
    }

    private void degas() throws InterruptedException {

        int bubblesNumber = 10 + 5 * getTemperature();
        for (int i = 0; i < bubblesNumber; i++) {
            bubbles.get(i).cramp();
            bubbles.remove(i);
        }
        Thread.sleep(1000);
        System.out.println("Running degas.");
    }

    public boolean isSparkle() {
        return bubbles.get(bubbles.size() - 1) == null;
    }

    public List<Bubble> getBubbles() {
        return bubbles;
    }

    public void setBubbles(List<Bubble> bubbles) {
        this.bubbles = bubbles;
    }
}