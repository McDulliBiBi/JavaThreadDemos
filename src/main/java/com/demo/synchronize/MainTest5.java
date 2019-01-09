package com.demo.synchronize;

public class MainTest5 {
    public static void main(String args[]){

        new Thread(){
            public void run(){
                for(int i = 0; i < 5; i++){
                    System.out.println("Thread 1 , i=" + i);
                }
            }
        }.start();

        new Thread(){
            public void run(){
                for(int i = 0; i < 5; i++){
                    System.out.println("Thread 2 , i=" + i);
                }
            }
        }.start();
    }
}
