package project.stuff;

import java.util.List;

public class SparklingWater extends Water {

    private boolean isOpened;
    private List<Bubble> bubbles;

    public SparklingWater(String color, String transparency, String smell, int temperature, List<Bubble> bubbles) {
        super(color, transparency, smell, temperature);
        this.bubbles = bubbles;
        this.isOpened();
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
            }
        });
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

    @Override
    public String toString() {
        return "SparklingWater{" +
                "isOpened=" + isOpened +
                ", bubbles=" + bubbles +
                '}';
    }
}