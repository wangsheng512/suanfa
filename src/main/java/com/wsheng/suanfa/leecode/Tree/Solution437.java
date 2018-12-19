package com.wsheng.suanfa.leecode.Tree;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * 给定一个二叉树，它的每个结点都存放着一个整数值。

     找出路径和等于给定数值的路径总数。

     路径不需要从根节点开始，也不需要在叶子节点结束，但是路径方向必须是向下的（只能从父节点到子节点）。

     二叉树不超过1000个节点，且节点数值范围是 [-1000000,1000000] 的整数。


     root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8

     10
     /  \
     5   -3
     / \    \
     3   2   11
     / \   \
     3  -2   1

     返回 3。和等于 8 的路径有:

     1.  5 -> 3
     2.  5 -> 2 -> 1
     3.  -3 -> 11

 * @Auther: wsheng
 * @Date: 2018/11/19 20:22
 * @Description:
 */
public class Solution437 {

    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        return findPathSum(root, 0, sum, map);
    }
    private int findPathSum(TreeNode curr, int sum, int target, Map<Integer, Integer> map) {
        if (curr == null) {
            return 0;
        }
        sum += curr.val;
        int numPathToCurr = map.getOrDefault(sum-target, 0);
        map.put(sum, map.getOrDefault(sum, 0) + 1);
        int res = numPathToCurr + findPathSum(curr.left, sum, target, map)
                + findPathSum(curr.right, sum, target, map);
        map.put(sum, map.get(sum) - 1);
        return res;
    }

     class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;

         TreeNode(int x) {
             val = x;
         }
     }

     //另一个方法，双递归
    /**
     * public class Solution {
         public int pathSum(TreeNode root, int sum) {
             if(root == null)
             return 0;
             return findPath(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
         }

         public int findPath(TreeNode root, int sum){
             int res = 0;
             if(root == null)
                return res;
             if(sum == root.val)
                res++;
             res += findPath(root.left, sum - root.val);
             res += findPath(root.right, sum - root.val);
             return res;
         }

        }
     */
}
