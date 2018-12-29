package com.wsheng.suanfa.leecode.ArrayList;

/**
 * @Auther: wsheng
 * @Date: 2018/12/29 21:44
 * @Description:
 */
public class Solution581 {


    public int findUnsortedSubarray(int[] nums) {
        int a = nums.length;
        int b = -2, c = -1;
        int min = nums[a-1], max = nums[0];
        for(int i=1;i<nums.length;i++){
            max = Math.max(max,nums[i]);
            if(nums[i]<max) a = i;
            min = Math.min(min,nums[a-1-i]);
            if(nums[a-1-i]>min) c = a-1-i;
        }
        return b-c+1;
    }
}
