package com.demo.state;

public class MainTest {
    public static void main(String args[]) throws Exception{
        ThreadState threadState = new ThreadState();
        Thread.sleep(2000);
        threadState.start();
    }
}
