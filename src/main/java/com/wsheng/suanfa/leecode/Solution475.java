package com.wsheng.suanfa.leecode;

import java.util.Arrays;

/**
 * @Auther: wsheng
 * @Date: 2018/12/1 23:17
 * @Description:
 */
public class Solution475 {

    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        int result = 0;
        for(int house:houses) {
            int index = Arrays.binarySearch(heaters, house);
            if(index<0) {
                index = ~index;
                int dist1 = index - 1 >= 0 ? house - heaters[index - 1] : Integer.MAX_VALUE;
                int dist2 = index < heaters.length ? heaters[index] - house : Integer.MAX_VALUE;
                result = Math.max(result, Math.min(dist1, dist2));
            }
        }
        return result;
    }
}
