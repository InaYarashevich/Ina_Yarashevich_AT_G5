package tasks.classwork.day13_codeBlocks;

public class Blocks {

    private int x;
    private static int y;

    {
        method();
    }

    public void method() {
        System.out.println("I am public static void method");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        Blocks.y = y;
    }
}
