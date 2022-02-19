package bubbles;

public class SparklingWater extends Water {

    Bubble bubble = new Bubble();

    public SparklingWater(String color, String clarity, String smell, double temperature) {
        super(color, clarity, smell, temperature);
    }

    public SparklingWater() {
    }

    public void pump(Bubble[] bubbles) {

       for (int i = 0; i < bubbles.length; i++){
           bubbles[i] = new Bubble("CO2");
       }
    }

    public void degas(Bubble[] bubbles) {

        pump(bubbles);

        int i = 0;
        int length = bubbles.length;

        for (Bubble i1 : bubbles) {

            for (int k = i; k < bubbles.length - 1; k++) {
                bubbles[k] = bubbles[k + 1];
            }
            length--;

        bubble.burstBubble();
        }
    }

    @Override
    public String toString() {
        return "SparklingWater{" +
                "bubble=" + bubble +
                '}';
    }
}
