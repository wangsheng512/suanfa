package com.wsheng.suanfa;



/**
 * @Auther: wsheng
 * @Date: 2018/11/21 17:50
 * @Description:
 */
public class Solution441 {

    public static int arrangeCoins(int n) {
        if (n == 0)
            return 0;
        int i = 0;
        while (n > 0) {
            i++;
            n -= i;
        }
        return i - 1;
    }

    public int arrangeCoins2(int n) {
        return (int)((Math.sqrt(8*(long)n + 1) - 1)/2);
    }

    public static void main(String[] args) {
        int s = Solution441.arrangeCoins(0);
        System.out.println(s);
    }
}
