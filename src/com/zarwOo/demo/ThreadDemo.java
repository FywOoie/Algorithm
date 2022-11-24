package com.zarwOo.demo;

public class ThreadDemo {
    class MyThread extends Thread{
        @Override
        public void run(){
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
        Thread myThread1 = new MyThread();
        Thread myThread2 = new MyThread();
        myThread1.start();
        myThread2.start();
    }

    public static void main(String[] args){
        new ThreadDemo().test();
    }

}
