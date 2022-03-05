package main.java.project.runner;

import main.java.project.boxing.Bottle;

public class Runner {
    public static void main(String[] args) throws InterruptedException {

        Bottle bottle = new Bottle(0.5);
        Bottle bottle2 = new Bottle(1);
        Bottle bottle3 = new Bottle(1.5);

        bottle.open();
        System.out.println();
        bottle2.open();
        System.out.println();
        bottle3.open();
    }
}