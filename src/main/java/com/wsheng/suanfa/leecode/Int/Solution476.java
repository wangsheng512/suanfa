package com.wsheng.suanfa.leecode.Int;

/**
 * @Auther: wsheng
 * @Date: 2018/12/2 22:57
 * @Description:
 */
public class Solution476 {

    public int findComplement(int num) {
        StringBuilder sbin=new StringBuilder(Integer.toBinaryString(num));
        boolean flag = false;
        for (int i = 0; i < sbin.length(); i++) {
            if (sbin.charAt(i) == '1'){
                flag = true;
            }
            if (flag) {
                sbin.setCharAt(i, sbin.charAt(i) == '1' ? '0' : '1');
            }
        }
        return Integer.valueOf(sbin.toString(), 2);
    }
}
