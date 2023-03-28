package org.Problem10;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class jobScheduler {
    public static ScheduledExecutorService executor;
    public static ScheduledFuture<?> solution(Runnable command, int delay_ms) {
        return executor.schedule( command, delay_ms, TimeUnit.MILLISECONDS );
    }

}
