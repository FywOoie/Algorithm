package com.zarwOo.demo;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    class myRunnable implements Runnable{
        @Override
        public void run() {
            try{
                for(int i = 0;i < 5;++i){
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(1000);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    private void test(){
        // 创建线程池
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for(int i = 0;i < 2;i++){
            Runnable runnable = new myRunnable();
            executorService.execute(runnable);
        }
        executorService.shutdown();
    }

    public static void main(String[] args){
        new ThreadPool().test();
    }
}
