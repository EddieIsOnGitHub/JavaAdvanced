package listing1_9;

import listing1_10.CountDownClockSync;

import java.util.concurrent.ScheduledThreadPoolExecutor;

//Creating Two More CountDownClock Threads
public class DoTwoThingsSync {
    ScheduledThreadPoolExecutor pool =
            new ScheduledThreadPoolExecutor(2);
    CountDownClockSync clock =
            new CountDownClockSync(20);
    public static void main(String[] args)
    {
        new DoTwoThingsSync();
    }
    DoTwoThingsSync()
    {
        pool.execute(clock);
        pool.execute(clock);
        pool.shutdown();
    }
}
