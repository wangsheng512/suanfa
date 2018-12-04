package com.wsheng.suanfa.leecode;

import java.util.Arrays;

/**
 * @Auther: wsheng
 * @Date: 2018/11/26 20:59
 * @Description:
 */
public class Solution455 {

    public int findContentChildren(int[] g, int[] s) {
        int count = 0;

        Arrays.sort(g);
        Arrays.sort(s);

        for (int i = 0,j = 0; i < g.length && j < s.length; )
            if (g[i] <= s[j]){
                count++;
                i++;
                j++;
            }else j++;

        return count;
    }

}
