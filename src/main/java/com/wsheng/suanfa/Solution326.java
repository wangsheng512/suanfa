package com.wsheng.suanfa;

/**
 * @Auther: wsheng
 * @Date: 2018/10/27 22:36
 * @Description:
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
