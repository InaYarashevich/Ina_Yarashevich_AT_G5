package tasks.classwork.day7;

public class SecondClass extends FirstClass {

    public int foo(int x) {
        int y = super.foo(x);
        System.out.println(y);
        return y;
    }
}
