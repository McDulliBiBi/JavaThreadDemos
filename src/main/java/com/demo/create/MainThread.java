package com.demo.create;

public class MainThread {
    public static void main(String args[]){
       /* ExtendsThread thread1 = new ExtendsThread();
        ExtendsThread thread2 = new ExtendsThread();
        ExtendsThread thread3 = new ExtendsThread();
        ExtendsThread thread4 = new ExtendsThread();*/

        ImplementsRunnable implementsRunnable = new ImplementsRunnable();
        Thread thread1 = new Thread(implementsRunnable);
        Thread thread2 = new Thread(implementsRunnable);
        Thread thread3 = new Thread(implementsRunnable);
        Thread thread4 = new Thread(implementsRunnable);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }

}
