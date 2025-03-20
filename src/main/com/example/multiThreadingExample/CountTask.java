package com.example.multiThreadingExample;

public class CountTask implements Runnable{
    private final ShardCount counter;
    private final int times;

    public CountTask(ShardCount counter, int times) {
        this.counter = counter;
        this.times = times;
    }

    @Override
    public void run(){
        for(int i=0;i<times;i++){
            counter.increment();
        }
    }
}
