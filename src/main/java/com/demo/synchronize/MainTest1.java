package com.demo.synchronize;

/**
 * 两个线程中分别new两个实例
 */
public class MainTest1 {
    public static void main(String[] agrs) {
        new Thread(){
            public void run(){
                Utils utils = new Utils();
                utils.sendMail1();
            }
        }.start();

        new Thread(){
            public void run(){
                Utils utils = new Utils();
                utils.makeCall1();
            }
        }.start();
    }
}
