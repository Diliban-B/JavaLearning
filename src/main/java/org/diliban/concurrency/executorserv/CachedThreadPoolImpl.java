package org.diliban.concurrency.executorserv;

import java.util.concurrent.*;

public class CachedThreadPoolImpl {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

       CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Hello";
        });



        System.out.println("Main thread is running");
        Thread.sleep(2000);
    }
}
