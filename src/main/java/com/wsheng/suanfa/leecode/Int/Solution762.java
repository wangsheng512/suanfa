package com.wsheng.suanfa.leecode.Int;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Auther: wsheng
 * @Date: 2019/2/18 22:38
 * @Description:
 */
public class Solution762 {

    public int countPrimeSetBits(int L, int R) {
        Set<Integer> set  = new HashSet<>(Arrays.asList(2,3,5,7,11,13,17,19));
        int result = 0;
        for(int i=L;i<=R;i++) {
            int tmp = i;
            int cnt =0;
            while(tmp!=0) {
                if( (tmp&1) ==1) cnt++;
                tmp>>=1;
            }
            if(set.contains(cnt))
                result++;
        }
        return result;
    }
}
