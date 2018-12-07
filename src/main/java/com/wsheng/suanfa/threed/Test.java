package com.wsheng.suanfa.threed;

import java.util.concurrent.locks.LockSupport;


public class Test {
    //wait方法释放锁，notify不释放锁
/* public static void main(String[] args) throws Exception{
    Object lock = new Object();
    Thread a = new Thread(new Runnable() {
        @Override
        public void run() {
            int sum = 0;
            for (int i = 0;i < 10; i++){
                sum += i;
            }
            synchronized (lock){
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.err.println("sum: "+sum);
        }
    });
    a.start();
    Thread.sleep(2000);
    synchronized (lock){
        lock.notify();
    }
}*/

    public static void main(String[] args)  throws Exception{
        Object lock = new Object();
        Thread a = new Thread(new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for (int i = 0;i < 10; i++){
                    sum += i;
                }
                LockSupport.park();
                System.err.println("sum: "+sum);
            }
        });
        a.start();
        Thread.sleep(2000);
        LockSupport.unpark(a);
    }
}


