package basetask;

public class Bee {

    private String gender;
    private long weight;

    public Bee(){

    }

    public Bee(String gender, long weight) {
        this.gender = gender;
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public void printBeeDetails(long weight){

       long massa = 500 / weight;
        System.out.println("Я легче лося в " + massa + " раз");
    }

    @Override
    public String toString() {
        return "Bee{" +
                "gender='" + gender + '\'' +
                ", weight=" + weight +
                '}';
    }
}
