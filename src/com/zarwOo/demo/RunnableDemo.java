package com.zarwOo.demo;

public class RunnableDemo {
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
        Runnable runnable = new myRunnable();
        Thread myThread1 = new Thread(runnable);
        Thread myThread2 = new Thread(runnable);
        myThread1.start();
        myThread2.start();
    }

    public static void main(String[] args){
        new RunnableDemo().test();
    }
}
