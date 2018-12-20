package com.wsheng.suanfa.leecode.ArrayList;

import java.util.HashMap;

/**
 * @Auther: wsheng
 * @Date: 2018/12/7 09:34
 * @Description:
 *
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。

    你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。

    示例:

    给定 nums = [2, 7, 11, 15], target = 9

    因为 nums[0] + nums[1] = 2 + 7 = 9
    所以返回 [0, 1]
 */
public class Solution1 {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] res = new int[2];
        for (int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            if (map.containsKey(target-nums[i])&& i != map.get(target-nums[i])){
                res[0] = i;
                res[1] = map.get(target-nums[i]);
                return res;
            }
        }
        return res;
    }

    public int[] twoSum2(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int v = target - nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == v && j != i){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int[] aa = Solution1.twoSum(nums,9);
        for (int s :aa){
         System.out.println(s);
        }
    }
}
