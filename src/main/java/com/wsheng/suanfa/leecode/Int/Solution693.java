package com.wsheng.suanfa.leecode.Int;

/**
 * @Auther: wsheng
 * @Date: 2019/1/28 22:32
 * @Description:
 */
public class Solution693 {


    public boolean hasAlternatingBits(int n) {
        String num = Integer.toBinaryString(n);
        char[] chars = num.toCharArray();
        for (int i=0;i<chars.length-1;i++){
            if (chars[i] == chars[i+1]) return false;
        }
        return true;
    }






}
