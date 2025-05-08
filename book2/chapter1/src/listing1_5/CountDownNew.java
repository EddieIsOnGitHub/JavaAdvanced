package listing1_5;

public class CountDownNew implements Runnable {
    int t;
    public CountDownNew(int t) {
        this.t = t;
    }
    public void run() {
        System.out.println("T minus "+t);
    }
}
