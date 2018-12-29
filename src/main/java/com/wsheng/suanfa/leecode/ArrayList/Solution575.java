package com.wsheng.suanfa.leecode.ArrayList;


import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: wsheng
 * @Date: 2018/12/28 20:16
 * @Description:
 */
public class Solution575 {


    public static int distributeCandies(int[] candies) {
        Map<Integer,Integer> map=new HashMap<>();
        int n=candies.length/2;
        for(int i:candies) {
            map.put(i, 1);
        }
        int d=map.size();
        if(d>n) {
            return n;
        }else {
            return d;
        }
    }

    public static void main(String[] args) {
        Solution575.distributeCandies(new int[]{1,3,});
    }
}
