package com.wsheng.suanfa.leecode.ArrayList;

/**
 * @Auther: wsheng
 * @Date: 2019/1/5 00:56
 * @Description:
 */
public class Solution598 {

    public int maxCount(int m, int n, int[][] ops) {
        if(ops.length == 0) return m*n;
        int a = Integer.MAX_VALUE,b = Integer.MAX_VALUE;
        for(int i = 0; i < ops.length;i++){
            a = Math.min(a,ops[i][0]);
            b = Math.min(b,ops[i][1]);
        }
        return a * b;
    }
}
