package com.wsheng.suanfa.threed;


import java.util.concurrent.Callable;

/**
 * @Auther: wsheng
 * @Date: 2019/2/16 13:57
 * @Description:
 */
public class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        String value = "test";
        System.out.println("Ready to work");
        Thread.sleep(5000);
        System.out.println("task done");
        return value;
    }
}
