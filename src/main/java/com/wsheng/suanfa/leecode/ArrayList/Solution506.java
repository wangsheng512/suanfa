package com.wsheng.suanfa.leecode.ArrayList;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: wsheng
 * @Date: 2018/12/10 19:24
 * @Description:
 */
public class Solution506 {

    public static String[] findRelativeRanks(int[] nums) {
        int max = 0;
        for (int x: nums){
            if (x > max) {
                max = x;
            }
        }
        Integer[] res = new Integer[max+1];
        Map<Integer,String> temp = new HashMap<>();
        temp.put(1,"Gold Medal");
        temp.put(2,"Silver Medal");
        temp.put(3,"Bronze Medal");
        Map<Integer,Integer> temp2 = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            res[nums[i]] = nums[i];
            temp2.put(nums[i],i);
        }
        String[] result = new String[nums.length];
        int count = 1,k = 0;
        for (int i = res.length - 1; i >=0; i --){
            if (res[i] != null){
                if (temp.containsKey(count)){
                    result[temp2.get(res[i])] = temp.get(count);
                    count++;
                }else {
                    result[temp2.get(res[i])] = count+"";
                    count++;
                }

            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] ss = Solution506.findRelativeRanks(new int[]{5, 4, 3, 2, 1});
        for (String s : ss){
            System.out.println(s);
        }
    }
}
