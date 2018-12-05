package com.wsheng.suanfa.leecode;

import java.util.*;

/**Given two arrays, write a function to compute their intersection.

    Example:
    Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
    计算两个数组的交集
 * @Auther: wsheng
 * @Date: 2018/10/31 16:42
 * @Description:
 */
public class Solution349 {

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> nums = new HashSet<Integer>();
        Set<Integer> result = new HashSet<>();
        for(int i=0;i<nums2.length;i++) {
            nums.add(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++) {
            if(nums.contains(nums1[i])) {
                result.add(nums1[i]);
            }
        }
        int[] res = new int[result.size()];
        int i=0;
        Iterator iter = result.iterator();
        while(iter.hasNext()){
            res[i++]=(int)iter.next();
        }
        return res;
    }

    public static int[] intersection2(int[] nums1, int[] nums2) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int num : nums1)
            treeSet.add(num);
        ArrayList<Integer> list = new ArrayList<>();
        for (int num :nums2){
            if (treeSet.contains(num)){
                list.add(num);
                treeSet.remove(num);
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0;i<list.size();i++){
            res[i] = list.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = Solution349.intersection2(new int[]{1,2,2,1},new int[]{2,2});
        for (int i = 0 ;i<a.length;i++){
            int b = a[i];
            System.out.println(b);
        }

    }

}
