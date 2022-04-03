package main.java.tasks.homework.threads;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task1_6 {

    public static void main(String[] args) {

        List<Mouse> mouseList = IntStream.rangeClosed(1, 420)
                .boxed()
                .map(Mouse::new)
                .collect(Collectors.toList());

        Thread t1 = new Thread(() -> {
            synchronized (mouseList) {
                System.out.println(Thread.currentThread().getName());
                mouseList.forEach(mouse -> {
                    for (int i = 0; i < mouseList.size(); i++) {
                        if (mouseList.indexOf(i) % 2 == 0) {
                            mouseList.get(i).peep();
                            mouseList.remove(i);
                        }
                    }
                });
            }
            try {
                Thread.sleep(170);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (mouseList) {
                System.out.println(Thread.currentThread().getName());
                mouseList.forEach(mouse -> {
                    for (int i = 0; i < mouseList.size(); i++) {
                        if (mouseList.indexOf(i) % 2 == 0) {
                            mouseList.get(i).peep();
                            mouseList.remove(i);
                        }
                    }
                });
            }
            try {
                Thread.sleep(170);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t3 = new Thread(() -> {
            synchronized (mouseList) {
                System.out.println(Thread.currentThread().getName());
                mouseList.forEach(mouse -> {
                    for (int i = 0; i < mouseList.size(); i++) {
                        if (mouseList.indexOf(i) % 2 == 0) {
                            mouseList.get(i).peep();
                            mouseList.remove(i);
                        }
                    }
                });
            }
            try {
                Thread.sleep(170);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t4 = new Thread(() -> {
            synchronized (mouseList) {
                System.out.println(Thread.currentThread().getName());
                mouseList.forEach(mouse -> {
                    for (int i = 0; i < mouseList.size(); i++) {
                        if (mouseList.indexOf(i) % 2 == 0) {
                            mouseList.get(i).peep();
                            mouseList.remove(i);
                        }
                    }
                });
            }
            try {
                Thread.sleep(170);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t5 = new Thread(() -> {
            synchronized (mouseList) {
                System.out.println(Thread.currentThread().getName());
                mouseList.forEach(mouse -> {
                    for (int i = 0; i < mouseList.size(); i++) {
                        if (mouseList.indexOf(i) % 2 == 0) {
                            mouseList.get(i).peep();
                            mouseList.remove(i);
                        }
                    }
                });
            }
            try {
                Thread.sleep(170);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t6 = new Thread(() -> {
            synchronized (mouseList) {
                System.out.println(Thread.currentThread().getName());
                mouseList.forEach(mouse -> {
                    for (int i = 0; i < mouseList.size(); i++) {
                        if (mouseList.indexOf(i) % 2 == 0) {
                            mouseList.get(i).peep();
                            mouseList.remove(i);
                        }
                    }
                });
            }
            try {
                Thread.sleep(170);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
//        t5.start();
//        t6.start();
    }
}
