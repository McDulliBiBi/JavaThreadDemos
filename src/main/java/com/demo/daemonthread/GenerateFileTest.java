package com.demo.daemonthread;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 守护线程demo1
 */

class TestRunnable implements Runnable{
    public void run(){
        try{
            Thread.sleep(1000);//守护线程阻塞1秒后运行
            File f=new File("daemon.txt");
            FileOutputStream os=new FileOutputStream(f,true);
            os.write("daemon".getBytes());
        }
        catch(IOException e1){
            e1.printStackTrace();
        }
        catch(InterruptedException e2){
            e2.printStackTrace();
        }
    }
}

public class GenerateFileTest {
    public static void main(String [] args){
        Runnable runnable = new TestRunnable();
        Thread thread = new Thread(runnable);
        thread.setDaemon(true);
        thread.start();
    }
}

