package com.wsheng.suanfa.leecode.ArrayList;

/**
 * @Auther: wsheng
 * @Date: 2019/1/30 22:24
 * @Description:
 */
public class Solution697 {
    public int findShortestSubArray(int[] nums) {
        int minlength=50000;
        int currlength;
        int maxfrequency=0;
        int[] frequency=new int[50001];
        int[] pos=new int[50001];

        if(nums.length==1){
            return 1;
        }
        for(int i=1;i<nums.length+1;i++){
            if(pos[nums[i-1]]!=0){
                frequency[nums[i-1]]++;
                currlength=i-pos[nums[i-1]]+1;
                if(frequency[nums[i-1]]>maxfrequency){
                    maxfrequency=frequency[nums[i-1]];
                    minlength=currlength;
                }else if(frequency[nums[i-1]]==maxfrequency){
                    minlength=currlength<minlength?currlength:minlength;
                }
            }else{
                pos[nums[i-1]]=i;
            }
        }
        if(maxfrequency==0){
            return 1;
        }
        return minlength;
    }
}
