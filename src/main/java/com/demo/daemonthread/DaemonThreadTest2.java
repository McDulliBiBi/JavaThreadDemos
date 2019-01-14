package com.demo.daemonthread;

public class DaemonThreadTest2 {

    public static void main(String [] args){
        Thread thread1 = new MyCommon();
        Thread thread2 = new Thread(new MyDaemon());
        thread2.setDaemon(true);
        thread1.start();
        thread2.start();
    }
}

class MyCommon extends Thread {
    @Override
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("线程1第" + i + "次执行！");
            try{
                Thread.sleep(10);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

class MyDaemon extends Thread{
    @Override
    public void run(){
        for (long i = 0; i < 9999999L; i++){
            System.out.println("后台线程1第" + i + "次执行！");
            try{
                Thread.sleep(10);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}



