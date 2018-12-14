package com.wsheng.suanfa.leecode;

/**
 * @Auther: wsheng
 * @Date: 2018/12/14 17:52
 * @Description:
 */
public class Solution521 {


    public int findLUSlength(String a, String b) {
        if(a.equals(b))
            return -1;
        return a.length()>b.length()?a.length():b.length();
    }
}
