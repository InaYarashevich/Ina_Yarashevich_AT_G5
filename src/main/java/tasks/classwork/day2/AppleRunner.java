package tasks.classwork.day2;

public class AppleRunner {

    public static void main(String[] args) {

        Apple apple = new Apple();
        Apple apple2 = new Apple("red", "sour", 1, 2);
        apple.setColor("red");
        apple.setTaste("sweet");
        apple.setWeight(50);
        System.out.println(apple);
        System.out.println(apple2);
        System.out.println("Apple color: " + apple2.getColor());
    }
}
