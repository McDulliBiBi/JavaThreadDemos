package com.demo.keyword;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class ThisTest {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ThisTest(String name){
        this.name = name;
    }

    public ThisTest(){
        this("Mary");
    }

    public void func1(){
        System.out.println("func1");
    }

    public void func2(){
        this.func1();
    }
}
