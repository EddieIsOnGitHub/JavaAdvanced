package listing1_10;

public class CountDownClockSync extends Thread {
    private int start;
    public CountDownClockSync(int start) {
        this.start = start;
    }
    synchronized public void run() {
        for(int i = start; i >= 0; i--) {
            System.out.println("T minus "+i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e) {}
        }
    }
}
