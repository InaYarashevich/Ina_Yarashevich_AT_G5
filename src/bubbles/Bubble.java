package bubbles;

public class Bubble {

    private double bubbleVolume = 0.3;
    private String gasComposition;

    public Bubble(){}

    public Bubble(String gasComposition) {
        this.gasComposition = gasComposition;
    }

    public String getGasComposition() {
        return gasComposition;
    }

    public void setGasComposition(String gasComposition) {
        this.gasComposition = gasComposition;
    }

    public void burstBubble(){
        System.out.print("Cramp!" + " ");
    }
}
