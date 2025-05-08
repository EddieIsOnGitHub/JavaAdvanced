package listing1_3;

import listing1_1.CountDownClock;
import listing1_2.LaunchEvent;

//Using the CountDownApp class
public class CountDownApp {
    public static void main(String[] args) {
        Thread clock = new CountDownClock();
        Runnable flood, ignition, liftOff;
        flood=new LaunchEvent(16,"Flood the pad!");
        ignition=new LaunchEvent(6,"Start engines!");
        liftOff=new LaunchEvent(0, "LiftOff!");
        clock.start();
        new Thread(flood).start();
        new Thread(ignition).start();
        new Thread(liftOff).start();
    }
}

