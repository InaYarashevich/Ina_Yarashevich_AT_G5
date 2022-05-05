package tasks.classwork.day7;

public class ObjectContainerRunner {
    public static void main(String[] args) {

        ObjectContainer objectContainer = new ObjectContainer();

        for (int i = 0; i < 10; i++) {
            objectContainer.add("bugagashechka");
        }
        System.out.println(objectContainer + " - created!");

        while (!objectContainer.isEmpty()) {
            System.out.print(objectContainer.removeLast() + " ");
        }
    }
}
