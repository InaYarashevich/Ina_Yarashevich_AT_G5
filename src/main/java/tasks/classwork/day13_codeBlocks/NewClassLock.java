package tasks.classwork.day13_codeBlocks;

public class NewClassLock {

    public static void main(String[] args) throws InterruptedException {

        Object lock = new Object();

        new Thread(() -> {
            synchronized (lock) {
                for (int i = 0; i < 3; i++) {
                    try {
                        Thread.currentThread().sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.printf(" thread1-%s", i);
                }
            }
        }).start();

        Thread.sleep(1000);

        synchronized (lock) {
            for (int i = 0; i < 3; i++) {
                Thread.currentThread().sleep(1000);
                System.out.printf(" main-%s", i);
            }
        }
    }
}


