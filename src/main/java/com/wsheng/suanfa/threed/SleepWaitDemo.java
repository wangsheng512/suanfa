package com.wsheng.suanfa.threed;



/**
 * @Auther: wsheng
 * @Date: 2019/2/16 22:24
 * @Description:
 */
public class SleepWaitDemo {

    public static void main(String[] args) {
        final Object lock = new Object();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thred A is waiting to get lock");
                synchronized (lock){
                    try {
                        System.out.println("thread  A get lock");
                        Thread.sleep(20);
                        System.out.println("thread A do wailt method");
                        lock.wait();
                        System.out.println("thread A is done");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        }).start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thred B is waiting to get lock");
                synchronized (lock){
                    try {
                        System.out.println("thread  B get lock");
                        System.out.println("thread B is sleeping 10 ms");
                        Thread.sleep(10);
                        System.out.println("thread B is done");
                        lock.notify();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        }).start();
    }
}
