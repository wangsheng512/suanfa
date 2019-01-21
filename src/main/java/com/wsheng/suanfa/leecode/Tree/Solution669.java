package com.wsheng.suanfa.leecode.Tree;

/**
 * @Auther: wsheng
 * @Date: 2019/1/20 22:42
 * @Description:
 */
public class Solution669 {

    public TreeNode trimBST(TreeNode root, int L, int R) {
        if (root == null) {
            return null;
        }
        if (root.val >= L && root.val <= R) {
            root.left = trimBST(root.left, L, R);
            root.right = trimBST(root.right, L, R);
            return root;
        }
        if(root.val < L) {
            return trimBST(root.right, L, R);
        }
        return trimBST(root.left, L, R);
    }


    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
