package main.java.project.water;

public class SparklingWater extends Water {

    private boolean isOpened;
    private Bubble[] bubbles;

    public SparklingWater(String color, String transparency, String smell, int temperature) throws InterruptedException {
        super(color, transparency, smell, temperature);
        this.isOpened();
    }

    public SparklingWater() {}

    public void pump(Bubble[] bubbles) {
        for (int i = 0; i < this.bubbles.length; i++) {
            this.bubbles[i] = new Bubble("CO2");
        }
    }

    public void setOpened(boolean isOpened) {
        this.isOpened = isOpened;
    }

    private void isOpened() throws InterruptedException {
        if (isOpened){
            degas();
        }
    }

    private void degas() throws InterruptedException {

        int bubbleNumber = 10 + 5 * this.getTemperature();
        for (int i = 0; i < bubbleNumber; i++) {
            bubbles[i].cramp();
            bubbles[i] = null;
            Thread.sleep(1000);
        }
    }

  /*  public boolean isSparkle(){
    }*/

    public Bubble[] getBubbles() {
        return bubbles;
    }

    public void setBubbles(Bubble[] bubbles) {
        this.bubbles = bubbles;
    }
}