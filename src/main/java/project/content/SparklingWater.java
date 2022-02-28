package main.java.project.content;

public class SparklingWater extends Water {

    private Bubble[] bubbles;

    public SparklingWater(String color, String clarity, String smell, int temperature) {
        super(color, clarity, smell, temperature);
    }

    public SparklingWater() {
    }

    public Bubble[] getBubbles() {
        return bubbles;
    }

    public void setBubbles(Bubble[] bubbles) {
        this.bubbles = bubbles;
    }

    public void pump() {
        for (int i = 0; i < this.bubbles.length; i++) {
            this.bubbles[i] = new Bubble("CO2");
        }
    }

    public void degas() {
        for (int i = 0; i < this.bubbles.length; i++) {
            bubbles[i].burst();
            bubbles[i] = null;
        }
    }

    public void setOpened(boolean isOpened) {
    }
}