package com.wsheng.suanfa.leecode.ArrayList;

/**
 * @Auther: wsheng
 * @Date: 2018/12/4 20:00
 * @Description:
 */
public class Solution485 {

    public int findMaxConsecutiveOnes(int[] nums) {
        int a = 0;
        int b = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==1){
                a++;
            }else {
                b = Math.max(a,b);
                a = 0;
            }
        }
        return Math.max(a,b);
    }
}
