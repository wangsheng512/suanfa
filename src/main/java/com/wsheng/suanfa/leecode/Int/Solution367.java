package com.wsheng.suanfa.leecode.Int;

/**
 * @Auther: wsheng
 * @Date: 2018/11/2 17:04
 * @Description:
 */
public class Solution367 {

    public static boolean isPerfectSquare(int num) {
        if(num == 0 || num == 1) return true;
        for (int i = 1; i <= num / i; ++i) {
            if (i * i == num) return true;
        }
        return false;
    }

    public static boolean isPerfectSquare2(int num) {
        for(int i = 1;num > 0;i+=2)
            num -= i;
        return 0 == num;
    }

    public static boolean isPerfectSquare3(int num) {
        if(num == 0 || num == 1) return true;
        long a = num/2;
        long square = a*a;
        while(square > num)
        {
            a = a/2;
            square = a*a;
        }

        for(long i = a;i<=a*2;i++)
        {
            if(i*i == num) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        long startTime=System.nanoTime();
        boolean a = Solution367.isPerfectSquare(14);
        long endTime=System.nanoTime();
        System.out.println("时间"+(endTime-startTime)+"ns");

        long startTime1=System.nanoTime();
        boolean a1 = Solution367.isPerfectSquare2(14);
        long endTime1=System.nanoTime();
        System.out.println("时间"+(endTime1-startTime1)+"ns");

        long startTime2=System.nanoTime();
        boolean a2 = Solution367.isPerfectSquare3(14);
        long endTime2=System.nanoTime();
        System.out.println("时间"+(endTime2-startTime2)+"ns");
    }
}
