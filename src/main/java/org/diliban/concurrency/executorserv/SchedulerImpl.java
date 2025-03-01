package org.diliban.concurrency.executorserv;

import org.diliban.concurrency.runnables.CheckFileChange;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class SchedulerImpl {
    public static void main(String[] args) {

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);


        scheduledExecutorService.scheduleAtFixedRate(new CheckFileChange(), 0, 1, java.util.concurrent.TimeUnit.SECONDS);
    }
}
