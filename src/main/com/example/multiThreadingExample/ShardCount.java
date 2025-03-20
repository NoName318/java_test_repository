package com.example.multiThreadingExample;

public class ShardCount {
    private int count=0;

    public synchronized void increment(){
        count++;
        System.out.println(Thread.currentThread().getName()+"->"+count);
    }
}
