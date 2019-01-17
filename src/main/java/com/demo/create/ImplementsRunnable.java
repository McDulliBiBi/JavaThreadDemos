package com.demo.create;

public class ImplementsRunnable implements Runnable {
    private int tickets = 10;

    public void run() {
        //线程体
        while(tickets > 0 ){
            System.out.println("线程" +Thread.currentThread().getName() +
                    "卖出了第" + tickets-- + "张票" );
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
