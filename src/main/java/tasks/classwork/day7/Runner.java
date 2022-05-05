package tasks.classwork.day7;

public class Runner {

    public static void main(String[] args){

        FirstClass firstClass = new SecondClass();
        firstClass.foo(5);

        FirstClass firstClass1 = new FirstClass() {
            public int foo(int x) {
                int y = super.foo(x);
                System.out.println(y);
                return y;
            }
        };
        firstClass1.foo(5);
    }
}
