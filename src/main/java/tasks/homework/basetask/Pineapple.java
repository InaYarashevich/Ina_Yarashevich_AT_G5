package main.java.tasks.homework.basetask;

public class Pineapple {

    private String grade;
    private double heatCapacity;

    public Pineapple(String grade, double heatCapacity) {
        this.grade = grade;
        this.heatCapacity = heatCapacity;
    }

    public void printPineappleDetails() {

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
