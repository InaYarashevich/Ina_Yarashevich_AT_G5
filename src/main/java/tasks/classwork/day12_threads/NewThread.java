package tasks.classwork.day12_threads;

public class NewThread {

    public static void main(String[] args) throws InterruptedException {

        new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.printf("t1-%s", i);
            }
        }).start();


        for (int i = 0; i < 3; i++) {
            Thread.sleep(1000);
            System.out.printf("m-%s", i);
        }
    }
}
