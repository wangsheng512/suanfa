package com.wsheng.suanfa.threed;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Auther: wsheng
 * @Date: 2019/2/16 14:04
 * @Description:
 */
public class FutureTaskDemo {

    public static void main(String[] args) throws ExecutionException,
            InterruptedException {
        FutureTask<String> futureTask = new FutureTask<String>(new MyCallable());
        new Thread(futureTask).start();
        if (!futureTask.isDone()){
            System.out.println("task has not  finished , please wait!");
        }
        System.out.println("task return :"+ futureTask.get());
    }
}
