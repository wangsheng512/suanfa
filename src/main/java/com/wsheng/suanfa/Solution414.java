package com.wsheng.suanfa;


import java.util.TreeSet;

/**
 * @Auther: wsheng
 * @Date: 2018/11/14 21:48
 * @Description:
 */
public class Solution414 {

    public int thirdMax(int[] nums){
        TreeSet ts = new TreeSet();
        for(int x=0;x<nums.length;x++)
            ts.add(nums[x]);
        if(ts.size()<=2)
            return (Integer)ts.last();
        else {
            int y = (Integer)ts.pollLast();
            int z = (Integer)ts.pollLast();
            int v = (Integer)ts.pollLast();
            return v;
        }
    }
}
