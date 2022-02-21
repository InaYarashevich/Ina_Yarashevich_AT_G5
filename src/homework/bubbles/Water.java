package homework.bubbles;

public abstract class Water {

    private String color;
    private String clarity;
    private String smell;
    private double temperature;

    public Water(String color, String clarity, String smell, double temperature) {
        this.color = color;
        this.clarity = clarity;
        this.smell = smell;
        this.temperature = temperature;
    }

    public Water() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getClarity() {
        return clarity;
    }

    public void setClarity(String clarity) {
        this.clarity = clarity;
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
