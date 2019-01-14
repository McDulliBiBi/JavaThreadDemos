package com.demo.synchronize;

/**
 * 普通多线程
 */
public class MainTest0 {
    public static void main(String args[]){

        new Thread(){
            public void run(){
                for(int i = 0; i < 10; i++){
                    System.out.println("Thread 1 , i=" + i);
                }
            }
        }.start();

        new Thread(){
            public void run(){
                for(int i = 0; i < 10; i++){
                    System.out.println("Thread 2 , i=" + i);
                }
            }
        }.start();

        for(int i = 0; i < 10; i++){
            System.out.println("Thread Main , i=" + i);
        }
    }
}
