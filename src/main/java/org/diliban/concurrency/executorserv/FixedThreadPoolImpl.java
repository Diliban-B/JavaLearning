package org.diliban.concurrency.executorserv;

import org.diliban.concurrency.runnables.Counter;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FixedThreadPoolImpl {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        List<Future<Integer>> results= executorService.invokeAll(List.of(new Counter("first"), new Counter("second"), new Counter("third")));

        results.forEach(result -> {
            try {
                System.out.println(result.get());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        executorService.shutdown();
    }
}
