package com.wsheng.suanfa.leecode.ArrayList;

import java.util.Arrays;

/**
 * @Auther: wsheng
 * @Date: 2019/1/12 20:13
 * @Description:
 */
public class Solution628 {
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int result = nums[n-1]*nums[n-2]*nums[n-3];
        if (nums[0]*nums[1]*nums[n-1]>result)
            return nums[0]*nums[1]*nums[n-1];
        return result;
    }

    public static void main(String[] args) {
        Solution628.maximumProduct(new int[3]);
    }
}
