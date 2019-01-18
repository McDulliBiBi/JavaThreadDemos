package com.demo.create;

public class ImplementsRunnable2 implements Runnable{
    static int tickets = 10;
    static Object lock = new Object();
    public void run() {
        synchronized (lock) {
            while (tickets > 0) {
                System.out.println("线程" + Thread.currentThread().getName() +
                        "卖出了第" + tickets-- + "张票");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
