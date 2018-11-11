package com.wsheng.suanfa;


import javax.swing.tree.TreeNode;

/**
 * 404. Sum of Left Leaves

 Find the sum of all left leaves in a given binary tree.

 Example:

 3
 / \
 9  20
 /   \
 15     7

 There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.
 * @Auther: wsheng
 * @Date: 2018/11/10 21:58
 * @Description:
 */
public class Solution404 {

    public int sumOfLeftLeaves(TreeNode root){
        if (root == null) return 0;
        else if (root== null && root.right == null) return 0;
        else {
            return ((root.left != null && root.left.left == null && root.left.right == null) ?
                    root.left.val : sumOfLeftLeaves(root.left)) + ((root.right != null && (root.right.left != null || root.right.right != null)) ?
                    sumOfLeftLeaves(root.right) : 0);
        }
    }

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
}
