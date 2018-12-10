package com.bcv.lessons;
public class ThreadMy {

    public static void main(String[] args) {

        loopThread();
    }

    public static void loopThread() {
        System.out.println("Main thread started...");
        for (int i = 1; i <= 10; i++)
            new JThread("My thread " + i).start();
        System.out.println("Main thread finished...");
    }

    static class JThread extends Thread {

        JThread(String name) {
            super(name);
        }

        public void run() {

            System.out.printf("%s started... \n", Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread has been interrupted");
            }
            System.out.printf("%s fiished... \n", Thread.currentThread().getName());
        }
    }
}
