package basetask;

public class Mouse {

    private String name;
    private int age;

    public Mouse(){

    }

    public Mouse(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printMouseDetails(String name, int age){
        System.out.println("Я мышь, меня зовут " + name + " и мне " + age + " лет");
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
