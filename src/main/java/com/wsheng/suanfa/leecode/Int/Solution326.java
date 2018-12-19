package com.wsheng.suanfa.leecode.Int;

/**
 * @Auther: wsheng
 * @Date: 2018/10/27 22:36
 * @Description:
 * 给定一个整数，写一个函数来判断它是否是 3 的幂次方。
 */
public class Solution326 {

    public static boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        }
        while(n>1){
            if(n%3!=0){
                return false;
            }
            n/=3;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Solution326.isPowerOfThree(27));
    }

}
