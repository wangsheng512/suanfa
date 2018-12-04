package com.wsheng.suanfa.leecode;

/**
 * @Auther: wsheng
 * @Date: 2018/11/8 20:51
 * @Description:
 */
public class Solution400 {

    public static int findNthDigit(int n) {
        int len = 1;
        long count = 9;
        int start = 1;
        while (n > len * count) {
            n -= len * count;
            len += 1;
            count *= 10;
            start *= 10;
        }
        start += (n - 1) / len;
        String s = Integer.toString(start);
        return Character.getNumericValue(s.charAt((n - 1) % len));
    }

    public static int findNthDigit1(int n){
        // 该范围内所有实际数字都占用了digit个单数字
        int digit = 1;
        // 该范围之前的所有实际数字已经占用了totalDigit个单数字
        long totalDigit = 0;
        // 先查出区间范围
        while (true) {
            long top = totalDigit + digit * 9 * (long)Math.pow(10, digit -1);
            if(n >= totalDigit && n <= top)
                break;
            totalDigit = top;
            digit++;
        }
        // 根据范围算出具体的值
        int start = (int)Math.pow(10, digit - 1);
        int ret = 0;
        totalDigit += 1;
        // 第n个digit在哪个具体的实际数字上
        int value = start + (n - (int)totalDigit) / digit;
        ret = Integer.toString((int)value).charAt((int)((n - totalDigit)%digit)) - '0';
        return ret;
    }

    public static void main(String[] args) {
        int a = Solution400.findNthDigit(18);
        System.out.println(a);
    }


}
