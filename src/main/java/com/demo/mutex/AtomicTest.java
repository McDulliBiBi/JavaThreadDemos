package com.demo.mutex;

public class AtomicTest {

    static int count = 0;
    static Object lock = new Object();
    public static void main(String[] args) {
        Thread back = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1000000; ++i) {
                    synchronized (lock) {
                        ++count;
                    }
                }
            }
        };

        back.start();

        for (int i = 0; i < 1000000; ++i) {
            synchronized (lock) {
                ++count;
            }
        }

        try {
            back.join(); // wait for back thread finish.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(count);
    }
}
