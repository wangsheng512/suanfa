package com.wsheng.suanfa;

/**
 * @Auther: wsheng
 * @Date: 2018/11/29 20:14
 * @Description:
 */
public class Solution461 {


    public int hammingDistance(int x, int y) {
        int sum = x^y;
        int count;
        for(count = 0; sum > 0; count++){
            sum &= (sum - 1);
        }
        return count;
    }

}
