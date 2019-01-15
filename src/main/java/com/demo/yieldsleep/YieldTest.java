package com.demo.yieldsleep;

public class YieldTest {
    public static void main(String args[]){
        new Thread(){
            @Override
            public void run(){
                for(int i=0; i<10; i++){
                    System.out.println("线程1第" + i + "次运行");
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run(){
                for(int i=0; i<10; i++){
                    System.out.println("线程2第" + i + "次运行");
                    Thread.yield();
                }
            }
        }.start();
    }
}
