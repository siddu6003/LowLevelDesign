package EffectiveJava.Concurrency;

import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class StopThread {
    public static boolean stopRequested;

    private static synchronized void requestStop() {
        stopRequested = true;
    }

    private static synchronized boolean stopRequested() {
        return stopRequested;
    }

    public static void main(String args[]) throws InterruptedException {
        Thread backGround = new Thread(() -> {
            int i = 0;
            while (!stopRequested()) {
                System.out.println("request status at " + i + " " + stopRequested);
                i++;
            }
        });
        backGround.start();
        System.out.println("started");
        TimeUnit.SECONDS.sleep(1);
        requestStop();
    }
}
