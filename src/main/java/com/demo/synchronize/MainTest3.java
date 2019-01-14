package com.demo.synchronize;

public class MainTest3 {
    public static void main(String args[]){
        final Utils utils = new Utils();
        new Thread(){
            public void run(){
                utils.makeCall1();
            }
        }.start();

        new Thread(){
            public void run(){
                Utils.makeCall3();
            }
        }.start();
    }
}
