package com.wsheng.suanfa;

/**
 *
 * Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.

 Note:

 The length of both num1 and num2 is < 5100.
 Both num1 and num2 contains only digits 0-9.
 Both num1 and num2 does not contain any leading zero.
 You must not use any built-in BigInteger library or convert the inputs to integer directly.
 * @Auther: wsheng
 * @Date: 2018/11/15 19:07
 * @Description:
 */
public class Solution415 {

    public static String addStrings(String num1, String num2) {
        if (num1.length() == 0)
            return num2;
        else if (num2.length() == 0)
            return num1;
        boolean hasUp = false;
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        StringBuilder sb = new StringBuilder();
        while (i >=0 || j >= 0) {
            int n1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            int n2 = j >= 0 ? num2.charAt(j) - '0' : 0;
            int sum = n1 + n2 + (hasUp ? 1 : 0);
            if (sum >= 10) {
                sb.insert(0, Integer.toString(sum - 10));
                hasUp = true;
            } else {
                sb.insert(0, Integer.toString(sum));
                hasUp = false;
            }
            i--;
            j--;
        }
        if (hasUp) sb.insert(0, "1");
        return sb.toString();
    }


}
