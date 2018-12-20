package com.wsheng.suanfa.leecode.ArrayList;

/**
 * @Auther: wsheng
 * @Date: 2018/10/22 20:28
 * @Description:
 */
public class Solution268 {

    public int missingNumber(int[] nums){

        int sum = 0;
        for (int num : nums)
            sum += num;
        return (nums.length + 1)*nums.length/2 -sum;

    }
}
