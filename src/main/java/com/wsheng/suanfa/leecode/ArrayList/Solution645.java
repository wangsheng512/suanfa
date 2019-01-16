package com.wsheng.suanfa.leecode.ArrayList;

import java.util.HashSet;
import java.util.Set;


/**
 * @Auther: wsheng
 * @Date: 2019/1/16 19:39
 * @Description:
 */
public class Solution645 {

    public static int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int[] result = new int[2];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i]))
                result[0] = nums[i];
            else {
                set.add(nums[i]);
                sum += nums[i];
            }
        }
        result[1] = (1 + nums.length) * nums.length / 2 - sum;
        return result;
    }


    public int[] findErrorNums2(int[] nums) {
        int[] cont = new int[nums.length];
        int loss = 0;
        int repeat = 0;
        for (int i = 0; i < nums.length; i++) {
            cont[nums[i]-1]++;
        }
        for (int i = 0; i < nums.length; i++) {
            if (cont[i] == 0) {
                loss = i + 1;
            }
            if (cont[i] == 2) {
                repeat = i + 1;
            }
        }
        int[] res = new int[2];
        res[0] = repeat;
        res[1] = loss;
        return res;
    }

    public static void main(String[] args) {
        int[] ss = Solution645.findErrorNums(new int[]{1,2,2,4});
        System.out.println(ss);
    }
}
