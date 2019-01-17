package com.demo.synchronize;

/**
 * 两个线程中共用一个实例
 */
public class MainTest2 {
    public static void main(String args[]){
        final Utils test = new Utils();

        new Thread(){
            public void run(){
                //System.out.println("Thread 1");
                test.sendMail1();
            }
        }.start();
        new Thread(){
            public void run(){
               // System.out.println("Thread 2");
                test.makeCall1();
            }
        }.start();
    }
}
