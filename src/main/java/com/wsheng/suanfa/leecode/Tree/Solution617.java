package com.wsheng.suanfa.leecode.Tree;

/**
 * @Auther: wsheng
 * @Date: 2019/1/7 23:39
 * @Description:
 */
public class Solution617 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode root;
        TreeNode left_1 = null, left_2 = null;
        TreeNode right_1 = null, right_2 = null;
        if(t1 == null && t2 == null)
            return null;
        else if(t1 != null && t2 != null) {
            root = new TreeNode(t1.val + t2.val);
            left_1 = t1.left;
            left_2 = t2.left;
            right_1 = t1.right;
            right_2 = t2.right;
        } else if(t1 != null && t2 == null) {
            root = new TreeNode(t1.val);
            left_1 = t1.left;
            right_1 = t1.right;
        } else {
            root = new TreeNode(t2.val);
            left_2 = t2.left;
            right_2 = t2.right;
        }
        root.left = mergeTrees(left_1, left_2);
        root.right = mergeTrees(right_1, right_2);
        return root;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
