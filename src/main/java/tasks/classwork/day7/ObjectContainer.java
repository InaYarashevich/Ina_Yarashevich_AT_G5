package main.java.tasks.classwork.day7;

public class ObjectContainer {

    Object[] container = new Object[10];
    private int counter;

    public void add(Object object) {
        if (counter < container.length) {
            this.container[counter++] = object;
        }
    }

    public Object removeLast() {
        Object result = null;
        if (counter > 0) {
            result = container[counter - 1]; // позиция не пустого обЪекта
            container[--counter] = null;
        }
        return result;
    }

    public boolean isEmpty() {
        return counter == 0;
    }
}
