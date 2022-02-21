package homework.basetask;

public class Obstacle {

    private String description;
    private String severity;

    public Obstacle(String description, String severity) {
        this.description = description;
        this.severity = severity;
    }

    public void printObstacleDetails() {

        System.out.println("Возникло " + this.severity + " препятствиие " + this.description);
    }

    @Override
    public String toString() {
        return "Obstacle{" +
                "description='" + description + '\'' +
                ", severity='" + severity + '\'' +
                '}';
    }
}
