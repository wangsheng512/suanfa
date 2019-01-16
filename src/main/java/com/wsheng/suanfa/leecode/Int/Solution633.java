package com.wsheng.suanfa.leecode.Int;

/**
 * @Auther: wsheng
 * @Date: 2019/1/13 22:51
 * @Description:
 */
public class Solution633 {
    public boolean judgeSquareSum(int c) {
        int i = 0;
        int j = (int) Math.sqrt(c);
        while (i <= j) {
            int sum = i * i + j * j;
            if (sum == c) {
                return true;
            }
            if (sum > c) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
}
