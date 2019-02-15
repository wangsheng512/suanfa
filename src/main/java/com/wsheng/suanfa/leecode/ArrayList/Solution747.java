package com.wsheng.suanfa.leecode.ArrayList;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: wsheng
 * @Date: 2019/2/15 22:08
 * @Description:
 */
public class Solution747 {

    public int dominantIndex(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0 ;i<nums.length;i++){
            map.put(nums[i],i);
        }
        int[] copy = nums;
        Arrays.sort(copy);
        int num = copy.length;
        int a = copy[num-2];
        int b = copy[num-1];
        if (b>=2*a){
            return map.get(b);
        }
        return -1;
    }

    public int dominantIndex2(int[] nums) {
        int len = nums.length;
        if (len == 1)
            return 0;
        int max = 0;
        for (int i = 1; i < len; i++) {
            if (nums[max] < nums[i])
                max = i;
        }
        for (int i : nums) {
            if (nums[max] < i * 2 && nums[max] != i)
                return -1;
        }
        return max;
    }
}
