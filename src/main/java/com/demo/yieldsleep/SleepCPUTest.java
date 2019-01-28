package com.demo.yieldsleep;
public class SleepCPUTest {
    public static void main(String args[]){
        new Thread(){
            @Override
            public void run(){
                for(int i=0; i<5; i++){
                    System.out.println("子线程1，i=" + i);
                    if(i==2){
                        try{
                            Thread.sleep(1000);
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run(){
                for(int i=0; i<5; i++){
                    System.out.println("子线程2，i=" + i);
                }
            }
        }.start();
    }
}
