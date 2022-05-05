package tasks.homework.threads;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task_1_5_2 {

    static List<Mouse> mouseList = IntStream.rangeClosed(1, 380)
            .boxed()
            .map(Mouse::new)
            .collect(Collectors.toList());

    public static synchronized void removeMouse() {
        mouseList.stream().map(mouse -> mouse.getName().replaceAll("[^0-9]", ""))
                .map(Integer::parseInt)
                .filter(mouse -> mouse % 2 != 0)
                .peek(mouse -> System.out.println(mouseList.get(mouse)))
                .peek(mouse -> {
                    mouseList.get(mouse).peep();
                    mouseList.remove(mouse);
                })
                .forEach(System.out::println);
    }

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            System.out.println("Thread started: " + Thread.currentThread().getName());
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            removeMouse();
            System.out.println("Thread finished: " + Thread.currentThread().getName());
        });

        Thread t2 = new Thread(() -> {
            System.out.println("Thread started: " + Thread.currentThread().getName());
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            removeMouse();
            System.out.println("Thread finished: " + Thread.currentThread().getName());
        });

        Thread t3 = new Thread(() -> {
            System.out.println("Thread started: " + Thread.currentThread().getName());
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            removeMouse();
            System.out.println("Thread finished: " + Thread.currentThread().getName());
        });

        Thread t4 = new Thread(() -> {
            System.out.println("Thread started: " + Thread.currentThread().getName());
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            removeMouse();
            System.out.println("Thread finished: " + Thread.currentThread().getName());
        });

        Thread t5 = new Thread(() -> {
            System.out.println("Thread started: " + Thread.currentThread().getName());
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            removeMouse();
            System.out.println("Thread finished: " + Thread.currentThread().getName());
        });

        Thread t6 = new Thread(() -> {
            System.out.println("Thread started: " + Thread.currentThread().getName());
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            removeMouse();
            System.out.println("Thread finished: " + Thread.currentThread().getName());
        });

        Thread t7 = new Thread(() -> {
            System.out.println("Thread started: " + Thread.currentThread().getName());
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            removeMouse();
            System.out.println("Thread finished: " + Thread.currentThread().getName());
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
    }
}

