package com.wsheng.suanfa.leecode.String;

/**
 * @Auther: wsheng
 * @Date: 2019/2/24 19:56
 * @Description:
 */
public class Solution796 {

    public boolean rotateString(String A, String B) {
        if(A.length() != B.length())return false;
        return (A+A).indexOf(B) != -1;
    }
}
