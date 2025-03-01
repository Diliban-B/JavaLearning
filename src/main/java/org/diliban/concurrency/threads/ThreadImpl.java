package org.diliban.concurrency.threads;

public class ThreadImpl {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {


            System.out.println("Thread is running");
        });

        System.out.println(thread.getState());
        thread.start();
        thread.join(1000);
        System.out.println(thread.getState());


    }
}
