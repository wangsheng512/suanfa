package com.wsheng.suanfa.threed;

/**
 * @Auther: wsheng
 * @Date: 2019/2/16 13:14
 * @Description:
 */
public class CrlcleWait implements Runnable{

    private String value;
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        value = "we have data now";
    }

    public static void main(String[] args) throws InterruptedException {
        CrlcleWait crlcleWait = new CrlcleWait();
        Thread thread = new Thread(crlcleWait);
        thread.start();
        thread.join();
        System.out.println("value:"+crlcleWait.value);
    }
}
