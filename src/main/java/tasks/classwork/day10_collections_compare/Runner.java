package tasks.classwork.day10_collections_compare;

public class Runner {

    public static void main(String[] args) {

        MyClass mc = new MyClass();
        mc.justMethod(ClassX::new); //или x-> new ClassX(x)
    }
}
