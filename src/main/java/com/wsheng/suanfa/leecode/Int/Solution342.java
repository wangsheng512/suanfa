package com.wsheng.suanfa.leecode.Int;

/**
 * @Auther: wsheng
 * @Date: 2018/10/28 21:27
 * @Description:
 */
public class Solution342 {

    public boolean isPowerOfFour(int num){

        if(num <= 0)
            return false;
        return (num & (num - 1)) ==0 && (num & 0x55555555) !=0 ;
    }
}
