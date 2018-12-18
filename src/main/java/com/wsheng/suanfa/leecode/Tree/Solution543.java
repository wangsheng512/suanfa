package com.wsheng.suanfa.leecode.Tree;

/**
 * @Auther: wsheng
 * @Date: 2018/12/18 23:07
 * @Description:
 */
public class Solution543 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        hhh(root);
        return diameter;
    }
    public int hhh(TreeNode root){
        if (root == null)
            return 0;
        int left = hhh(root.left);
        int right = hhh(root.right);
        if (diameter<left+right)  diameter = left+right;
        return Math.max(left, right) + 1;
    }
}
