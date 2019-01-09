package com.demo.synchronize;

public class Utils {

    public void makeCall(){
        for (int i = 0; i < 1000000; i++){
            System.out.println("makeCall");
        }
    }

    public void sendMail(){
        for (int i = 0; i < 1000000; i++){
            System.out.println("sendMail");
        }
    }

    //对象锁（实例锁）的实现形式1：synchronized修饰非静态方法
    public synchronized void makeCall1() {
        for (int i = 0; i < 5; i++) {
         //while(true){
            try {
                System.out.println("makeCall1");
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void sendMail1() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("sendMail1");
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    //对象锁（实例锁）的实现形式2：synchronized代码块，在this上加锁
    public void makeCall2() {
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println("makeCall2");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void sendMail2() {
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println("sendMail2");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //类锁的实现形式1：synchronized修饰静态方法
    public static synchronized void makeCall3() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("makeCall3");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static synchronized void sendMail3() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("sendMail3");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //类锁的实现形式2：synchronized代码块，锁定的是Class对象
    public void makeCall4(){
        synchronized (Utils.class) {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println("makeCall4");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void sendMail4(){
        synchronized (Utils.class) {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println("sendMail4");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
