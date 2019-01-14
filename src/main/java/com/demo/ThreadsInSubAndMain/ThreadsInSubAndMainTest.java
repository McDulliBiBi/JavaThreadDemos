package com.demo.ThreadsInSubAndMain;

public class ThreadsInSubAndMainTest {
    public static void main(String[] args) throws InterruptedException {

        final Service service = new Service();

        //子线程
        new Thread(){
            @Override
            public void run() {
                for(int i=0;i<5;i++) {
                    service.sub();         //多次试图运行子线程
                }
            }
        }.start();

        //主线程
        for(int i=0;i<5;i++) {
            service.main();   //和子线程竞争锁
        }
    }
}
