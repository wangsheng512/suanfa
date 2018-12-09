package com.wsheng.suanfa.leecode;

/**
 * @Auther: wsheng
 * @Date: 2018/12/9 22:11
 * @Description:
 */
public class Solution11 {

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int max = 0;
        while(left<right){
            max = Math.max(max, Math.min(height[left], height[right])*(right-left));
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}
