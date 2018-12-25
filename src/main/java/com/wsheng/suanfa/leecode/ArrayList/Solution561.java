package com.wsheng.suanfa.leecode.ArrayList;

import java.util.Arrays;

/**
 * @Auther: wsheng
 * @Date: 2018/12/24 22:24
 * @Description:
 */
public class Solution561 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for (int i=0;i<nums.length;i++) {
            if (i % 2 == 0) result += nums[i];
        }
        return result;
    }
}
