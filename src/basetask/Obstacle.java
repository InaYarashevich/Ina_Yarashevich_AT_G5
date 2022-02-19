package basetask;

public class Obstacle {

    private String description;
    private String severity;

    public Obstacle(){
    }

    public Obstacle(String description, String severity) {
        this.description = description;
        this.severity = severity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public void printObstacleDetails(String description, String severity){
        System.out.println("Возникло " + severity + " препятствиие " + description);
    }

    @Override
    public String toString() {
        return "Obstacle{" +
                "description='" + description + '\'' +
                ", severity='" + severity + '\'' +
                '}';
    }
}
