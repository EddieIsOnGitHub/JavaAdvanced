package listing1_4;

import java.util.ArrayList;

// version 2.0 of the Countdown application
public class CountDownApp {
    public static void main(String[] args) {
        CountDownClock clock = new CountDownClock(20);
        ArrayList<Runnable> events = new ArrayList<Runnable>();
        events.add(new LaunchEvent(16,"Flood the flood!", clock));
        events.add(new LaunchEvent(6,"Start the engines!",clock));
        events.add(new LaunchEvent(0,"Liftoff!",clock));
        clock.start();
        for (Runnable event : events) {
            new Thread(event).start();
        }
    }
}
interface TimeMonitor{
    int getTime();
}
class CountDownClock extends Thread implements TimeMonitor{
    private int t;
    public CountDownClock(int start){
      t = start;
    }
    public void run(){
        for(; t>=0; t--){
            System.out.println("T minus "+t);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){}
        }
    }
    public int getTime(){
        return t;
    }
}
class LaunchEvent implements Runnable{
    private int start;
    private String message;
    TimeMonitor tm;
    public LaunchEvent(int start,String message,TimeMonitor tm){
        this.start = start;
        this.message = message;
        this.tm = tm;
    }
    public void run(){
        boolean eventDone = false;
        while(!eventDone){
            try{
                Thread.sleep(10);
            }catch (InterruptedException e){}
            if(tm.getTime()<=start){
                System.out.println(this.message);
                eventDone = true;
            }
        }
    }
}
