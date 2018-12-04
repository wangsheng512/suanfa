package com.wsheng.suanfa.leecode;


/**
 * Enhancer303 Range Sum Query - Immutable
     Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.
     Example:
     Given nums = [-2, 0, 3, -5, 2, -1]
     sumRange(0, 2) -> 1
     sumRange(2, 5) -> -1
     sumRange(0, 5) -> -3
     Note:
     You may assume that the array does not change.
     There are many calls to sumRange function
 * @Auther: wsheng
 * @Date: 2018/10/26 19:58
 * @Description:  u1>6L;?RsmDd
 */
public class NumArray {

    int[] val;
    public NumArray(int[] nums){

        val = new int[nums.length];
        if (val.length == 0)
            return;
        val[0] = nums[0];
        for (int i=1;i<nums.length;i++){
            val[i]= val[i-1] + nums[i];
        }
    }
    public int sumRange(int i, int j) {
        if(val.length == 0)
            return 0;

        if(j > val.length-1)
            j  = val.length-1;

        if(i <= 0)
            return val[j];
        return val[j]-val[i-1];
    }

    public static void main(String[] args) {
        int[] num = new int[]{-2, 0, 3, -5, 2, -1};
        NumArray numArray = new NumArray(num);
       int s =  numArray.sumRange(0,2);
       System.out.println(s);
    }

}
