package main.java.tasks.homework.threads;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task1_6 {

    static volatile List<Mouse> mouseList = IntStream.rangeClosed(1, 380)
            .boxed()
            .map(Mouse::new)
            .collect(Collectors.toList());

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            mouseList.forEach(mouse -> {
                if (mouseList.indexOf(mouse) % 2 == 0) {
                    mouse.peep();
                    mouseList.remove(mouse);
                }
            });
            try {
                Thread.sleep(170);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {
            mouseList.forEach(mouse -> {
                if (mouseList.indexOf(mouse) % 2 == 0) {
                    mouse.peep();
                    mouseList.remove(mouse);
                }
            });
            try {
                Thread.sleep(170);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });


        t1.start();
        t2.start();
//        t3.start();
//        t4.start();
//        t5.start();
//        t6.start();
    }

//    public static synchronized void removeMouse(){
//
//        mouseList.forEach(mouse -> {
//            if (mouseList.indexOf(mouse) % 2 == 0) {
//                mouse.peep();
//                mouseList.remove(mouse);
//            }
//        });
//    }
}
