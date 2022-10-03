package tasks.classwork.day13_codeBlocks;


public class Runner {

    public static void main(String[] args) {
// 'у' начинает существовать уже здесь, она принадлежит все классу
        Blocks b1 = new Blocks();
        Blocks b2 = new Blocks();

        b1.setX(1);
        b2.setY(2);

        b2.setX(3);
        b2.setY(4);

        System.out.println(b1.getX());
        System.out.println(b1.getY());
        System.out.println(b2.getX());
        System.out.println(b2.getY());
    }
}
