package org.Problem10;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        jobScheduler.executor = Executors.newSingleThreadScheduledExecutor();

        ScheduledFuture<?> future = jobScheduler.solution(() -> System.out.println("Hello world!"), 1000);


        jobScheduler.executor.shutdown();
        jobScheduler.executor = null;
    }
}
