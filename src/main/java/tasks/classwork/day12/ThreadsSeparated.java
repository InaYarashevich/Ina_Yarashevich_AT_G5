package tasks.classwork.day12;

public class ThreadsSeparated {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(ThreadDemo3::heavyMethod);

        Thread t2 = new Thread(ThreadDemo3::heavyMethod);

        Thread t3 = new Thread(ThreadDemo3::heavyMethod);

        t1.setPriority(Thread.NORM_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
