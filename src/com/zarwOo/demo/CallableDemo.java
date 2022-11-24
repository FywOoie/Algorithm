package com.zarwOo.demo;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CallableDemo implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        try{
            for(int i = 0;i < 5;++i){
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args){
        CallableDemo callable = new CallableDemo();
        FutureTask<Integer> futureTask1 = new FutureTask<>(callable);
        FutureTask<Integer> futureTask2 = new FutureTask<>(callable);
        Thread myThread1 = new Thread(futureTask1);
        Thread myThread2 = new Thread(futureTask2);
        myThread1.start();
        myThread2.start();
    }
}
