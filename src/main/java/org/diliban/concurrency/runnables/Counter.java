package org.diliban.concurrency.runnables;

import java.util.Random;
import java.util.concurrent.Callable;

public class Counter implements Callable<Integer> {

    private int count = new Random().nextInt(10);

    private String name;

    public Counter(String name) {
        this.name = name;
    }

    @Override
    public Integer call() throws Exception {

        for (int i = 0; i < 10; i++) {

            System.out.println("Counter " + name + " Count: " + count);
            count++;
            Thread.sleep(1000);
        }

        return count;
    }


}
