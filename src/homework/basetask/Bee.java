package homework.basetask;

public class Bee {

    private String gender;
    private long weight;

    public Bee(String gender, long weight) {
        this.gender = gender;
        this.weight = weight;
    }

    public void printBeeDetails() {

        System.out.println("Я легче лося в " + this.weight / 500 + " раз");
    }

    @Override
    public String toString() {
        return "Bee{" +
                "gender='" + gender + '\'' +
                ", weight=" + weight +
                '}';
    }
}
