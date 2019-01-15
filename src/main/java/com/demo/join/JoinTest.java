package com.demo.join;

public class JoinTest {
    public static void main(String args[]){
        System.out.println("主线程开始运行");

        Thread thread1 = new Thread(){
            @Override
            public void run() {
                for(int i=0; i<10; i++){
                    System.out.println("线程1第" + i + "次运行");
                }
            }
        };

        Thread thread2 = new Thread(){
            @Override
            public void run() {
                for(int i=0; i<10; i++){
                    System.out.println("线程2第" + i + "次运行");
                }
            }
        };

        thread1.start();
        thread2.start();

        try {
            thread1.join();
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            thread2.join();
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("主线程结束运行");
    }
}
