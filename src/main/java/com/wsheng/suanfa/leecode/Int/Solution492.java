package com.wsheng.suanfa.leecode.Int;

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
            if (area % i == 0) {  //取余数
                int j = area / i;  //商的整数
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

    public static void main(String[] args) {
        int area = 8;
        int end = (int)Math.sqrt(area);
        System.out.println(end);
    }
}
