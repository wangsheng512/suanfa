package com.wsheng.suanfa.leecode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @Auther: wsheng
 * @Date: 2018/12/8 11:01
 * @Description:
 */
public class Solution496 {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        if(nums1.length==0||nums1==null||nums2.length==0||nums2==null){
            return new int[0];//空的时候，返回的是空数组，而不是null
        }
        int[] res= new int[nums1.length];
        Map<Integer,Integer> map  = new HashMap<Integer, Integer>();
        for(int i =0;i<nums2.length;i++){
            map.put(nums2[i],i);
        }
        for (int j =0;j<nums1.length;j++){
            int startindex = map.get(nums1[j]);
            for(int a=startindex;a<nums2.length;a++){//不能a=startindex+1，因为最后一个的话，会判断不了
                if(nums2[a]>nums1[j]){
                    res[j]=nums2[a];//这里赋值的是，更新后的下标，a代表更新下标
                    break;
                }else {
                    res[j]=-1;
                }
            }
        }
        return res;
    }

    public int[] nextGreaterElement2(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], i);
        }
        for (int i = 0; i < nums2.length; i++) {
            map2.put(nums2[i], i);
        }
        for (int i = 0; i < nums1.length; i++) {
            boolean res = false;
            for (int j = map2.get(nums1[i]); j < nums2.length; j++) {
                if (nums2[j] > nums1[i]) {
                    nums1[i] = nums2[j];
                    res = true;
                    break;
                }
            }
            if (!res) {
                nums1[i] = -1;
            }
        }
        return nums1;
    }


}
