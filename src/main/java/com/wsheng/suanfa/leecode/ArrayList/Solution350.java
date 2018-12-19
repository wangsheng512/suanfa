package com.wsheng.suanfa.leecode.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

/**
 * 给定两个数组，编写一个函数来计算它们的交集。

 例1：

 输入：nums1 = [1,2,2,1]，nums2 = [2,2]
 产出：[2,2]

 例2：

 输入：nums1 = [4,9,5]，nums2 = [9,4,9,8,4]
 产出：[4,9]

 注意：

 结果中的每个元素应该出现在两个数组中显示的次数。
 结果可以是任何顺序。
 跟进：

 如果给定的数组已经排序怎么办？ 你会如何优化你的算法？
 如果nums1的尺寸与nums2的尺寸相比较小怎么办？ 哪种算法更好？
 如果nums2的元素存储在磁盘上，并且内存有限，以致您无法一次将所有元素加载到内存中，该怎么办？

 * @Auther: wsheng
 * @Date: 2018/11/1 20:11
 * @Description:
 */
public class Solution350 {

    public static int[] intersect(int[] nums1, int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList result = new ArrayList();
        for (int i = 0, j = 0; i < nums1.length && j < nums2.length; ){
            if (nums1[i] == nums2[j]){
                result.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++){
            res[i] = (int) result.get(i);
        }
        return res;
    }

    public static int[] intersect2(int[] nums1, int[] nums2){
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        for (int num : nums1){
            if (!treeMap.containsKey(num)){
                treeMap.put(num,1);
            }else {
                treeMap.put(num,treeMap.get(num)+1);
            }
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int num : nums2){
            if (treeMap.containsKey(num)){
                arrayList.add(num);
                treeMap.put(num,treeMap.get(num)-1);
                if (treeMap.get(num) == 0){
                    treeMap.remove(num);
                }
            }
        }
        int[] res = new int[arrayList.size()];
        for (int i = 0;i<arrayList.size();i++){
            res[i] = arrayList.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] aa = new int[]{1,2,3,4,6,9};
        int[] bb = new int[]{2,3,4};
        int[] mm = Solution350.intersect(aa,bb);
        for (int i=0;i<mm.length;i++){
            System.out.println(mm[i]);
        }
    }

}
