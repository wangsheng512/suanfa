package com.wsheng.suanfa.leecode.Tree;

/**
 * @Auther: wsheng
 * @Date: 2018/12/17 19:53
 * @Description:
 */
public class Solution538 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    int tempsum=0;
    public TreeNode convertBST(TreeNode root) {
        reverseorder(root);
        return root;
    }
    public void reverseorder(TreeNode root){
        if(root==null)return;
        reverseorder(root.right);
        root.val+=tempsum;
        tempsum=root.val;
        reverseorder(root.left);
    }
}
