package com.wsheng.suanfa.leecode;

/**
 *
 * 371 	Sum of Two Integers

 Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.

 Example 1:

 Input: a = 1, b = 2
 Output: 3

 Example 2:
 Input: a = -2, b = 3
 Output: 1
 * @Auther: wsheng
 * @Date: 2018/11/3 22:06
 * @Description:
 */
public class Solution371 {

    public static int getSum(int a, int b) {
        if (b == 0)
            return a;
        if (a == 0)
            return b;
        int sum = a ^ b;
        int carry = (a & b) << 1;

        return getSum(sum, carry);
    }

    public static void main(String[] args) {
        int m = Solution371.getSum(1,3);
        System.out.println(m);
    }

}
