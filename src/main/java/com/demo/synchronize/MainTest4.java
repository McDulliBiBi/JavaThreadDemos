package com.demo.synchronize;

public class MainTest4 {
    public static void main(String args[]){
        new Thread(){
            public void run(){
               // Utils.makeCall2();
            }
        }.start();

        new Thread(){
            public void run(){
                //Utils.sendMail2();
            }
        }.start();
    }
}
