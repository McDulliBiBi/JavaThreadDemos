package com.demo.create;

public class ExtendsThread extends Thread {
    private int tickets = 10;
    @Override
    public void run() {
        //线程体
        while(tickets > 0){
            System.out.println("线程" +Thread.currentThread().getName() +
                        "卖出了第" + tickets-- + "张票" );
        }
    }
}



