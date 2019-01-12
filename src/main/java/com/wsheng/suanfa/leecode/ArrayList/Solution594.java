package com.wsheng.suanfa.leecode.ArrayList;

import java.util.Arrays;

/**
 * @Auther: wsheng
 * @Date: 2019/1/1 20:32
 * @Description:
 */
public class Solution594 {

    public int findLHS(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length == 1){
            return 0;
        }
        Arrays.sort(nums);
        int max = 0, temp = nums[0], begin = 0, index = 0;
        boolean isStart = true;
        for (int i = 1; i <= nums.length; i++){
            if (i == nums.length || nums[i] != temp){
                if (!isStart){
                    max = max > (i - begin) ? max : (i - begin);
                    begin = index;
                }
                if (i == nums.length) break;
                if (nums[i] - temp == 1){
                    isStart = false;
                } else {
                    isStart = true;
                    begin = i;
                }
                temp = nums[i];
                index = i;
            }
        }
        return max;
    }
}
