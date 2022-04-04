package main.java.tasks.homework.threads;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task1_5 {

    static List<Mouse> mouseList = IntStream.rangeClosed(1, 380)
            .boxed()
            .map(Mouse::new)
            .collect(Collectors.toList());

    public static synchronized void removeMouse() {
        for (int i = 0; i < mouseList.size(); i++) {
            if (mouseList.indexOf(mouseList.get(i)) % 2 != 0) {
                mouseList.get(i).peep();
                mouseList.remove(i);
            }
        }
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
