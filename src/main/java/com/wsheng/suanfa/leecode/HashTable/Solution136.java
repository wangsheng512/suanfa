package com.wsheng.suanfa.leecode.HashTable;


import java.util.TreeMap;

/**
 * @Auther: wsheng
 * @Date: 2018/12/5 21:51
 * @Description:
 */
public class Solution136 {

    public int singleNumber(int[] nums) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for (int num : nums){
            if (!map.containsKey(num)){
                map.put(num,1);
            }else {
                map.put(num,map.get(num)+1);
            }
        }
        for (int num : nums){
            if (map.get(num) == 1){
                return num;
            }
        }
        return 0;
    }
}
