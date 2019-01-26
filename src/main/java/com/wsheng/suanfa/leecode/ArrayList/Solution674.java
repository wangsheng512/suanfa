package com.wsheng.suanfa.leecode.ArrayList;

/**
 * @Auther: wsheng
 * @Date: 2019/1/22 23:28
 * @Description:
 */
public class Solution674 {

    public int findLengthOfLCIS(int[] nums) {
        if(nums.length == 0)
            return 0;
        int max = 0;
        int count = 1;
        for(int i=0;i<nums.length - 1;i++){
            if(nums[i] < nums[i+1]){
                count++;
            }else{
                max = Math.max(count,max);
                count = 1;
            }
        }
        max = Math.max(count,max);
        return max;
    }
}
