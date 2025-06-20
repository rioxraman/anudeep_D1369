class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("MyRunnable run is runnning");
    }
}

public class ThreadDemoUsingRunnable {
    public static void main(String[] args) {
    MyRunnable r = new MyRunnable();
    r.run();
        Thread thread = new Thread(r);
        thread.start();
        System.out.println("MyRunnable is runnning");
    }
}
