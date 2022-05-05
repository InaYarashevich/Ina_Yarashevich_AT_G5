package tasks.homework.basetask;

public class Mouse {

    private String name;
    private int age;

    public Mouse(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printMouseDetails() {

        System.out.println("Я мышь, меня зовут " + this.name + " и мне " + this.age + " лет");
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
