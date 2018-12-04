package com.wsheng.suanfa.leecode;

import java.util.*;

/**
 * @Auther: wsheng
 * @Date: 2018/11/24 22:20
 * @Description:
 */
public class Solution448 {

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        if (nums == null || nums.length == 0) return list;
        for (int num : nums){
            set.add(num);
        }
        for (int i = 1;i<=nums.length;i++){
            if (set.add(i)){
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] aa = {4,3,2,7,8,2,3,1};
        List<Integer> hh = Solution448.findDisappearedNumbers(aa);
        System.out.println(hh);
    }
}
