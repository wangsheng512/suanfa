package com.wsheng.suanfa.leecode;

/**
 * @Auther: wsheng
 * @Date: 2018/12/6 23:23
 * @Description:
 */
public class Solution492 {

    public int[] constructRectangle(int area) {
        int end = (int)Math.sqrt(area);
        int num = area;
        int[] result = new int[2];
        for (int i = 1; i <= end; i++) {
            if (area % i == 0) {
                int j = area / i;
                int abs = j - i;
                if (abs < num) {
                    num = abs;
                    result[0] = j;
                    result[1] = i;
                }
            }
        }
        return result;
    }
}
