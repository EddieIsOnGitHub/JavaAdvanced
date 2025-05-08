package listing1_8;
import listing1_1.CountDownClock;

import java.util.concurrent.ScheduledThreadPoolExecutor;
//Creating Two CountDownClock Threads
public class DoTwoThings {
    ScheduledThreadPoolExecutor pool =
            new ScheduledThreadPoolExecutor(2);
    CountDownClock clock = new CountDownClock();
    public static void main(String[] args)
    {
        new DoTwoThings();
    }
    DoTwoThings()
    {
        pool.execute(clock);
        pool.execute(clock);
        pool.shutdown();
    }
}
