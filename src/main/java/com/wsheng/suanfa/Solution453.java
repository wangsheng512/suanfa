package com.wsheng.suanfa;


/**
 * @Auther: wsheng
 * @Date: 2018/11/25 20:32
 * @Description:
 */
public class Solution453 {

    public static int minMoves(int[] nums) {
        int sum=0,moves,min=nums[0];
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(nums[i]<min){
                min=nums[i];
            }
        }
        moves=sum-min*nums.length;
        return moves;
    }

    //move的次数就是每个元素和最小元素min的差值得总和
    public static int minMoves2(int[] nums) {
       if (nums.length == 0 || nums == null)
           return 0;
       int min = nums[0],resulut = 0;
       for (int i : nums){
           min = Math.min(min,i);
       }
       for (int i : nums){
           resulut += i-min;
       }
       return resulut;
    }

    public static void main(String[] args) {
        int[] aa = {1,2,3};
        int b = Solution453.minMoves2(aa);
        System.out.println(b);
    }
}
