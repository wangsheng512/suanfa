package com.wsheng.suanfa.leecode;

/**
 * @Auther: wsheng
 * @Date: 2018/10/23 14:03
 * @Description:
 */
public class Solution283 {

    public static void moveZeroes(int[] nums){

        int temp;
        for(int i=0 ;i<nums.length-1;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i]==0){
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] nums = new int[] { 0, 1, 0, 3, 12 };
        Solution283.moveZeroes(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
    }
}
