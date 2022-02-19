package basetask;

public class Pineapple {

    private String grade;
    private double heatCapacity;

    public Pineapple(){}

    public Pineapple(String grade, double heatCapacity) {
        this.grade = grade;
        this.heatCapacity = heatCapacity;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getHeatCapacity() {
        return heatCapacity;
    }

    public void setHeatCapacity(double heatCapacity) {
        this.heatCapacity = heatCapacity;
    }

    public void printPineappleDetails(double heatCapacity) {

        if (heatCapacity > 2140) {
            System.out.println("Я ананас, теплоемкость которого больше, чем у ветчины");
        } else {
            System.out.println("В ветчине тепла запасется больше :(");
        }
    }

    @Override
    public String toString() {
        return "Pineapple{" +
                "grade='" + grade + '\'' +
                ", heatCapacity=" + heatCapacity +
                '}';
    }
}
