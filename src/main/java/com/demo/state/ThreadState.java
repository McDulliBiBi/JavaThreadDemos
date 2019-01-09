package com.demo.state;

public class ThreadState extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("enter run()");
            Thread.sleep(2000);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
