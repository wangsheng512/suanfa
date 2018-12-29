package com.wsheng.suanfa.leecode.Tree;

/**
 * @Auther: wsheng
 * @Date: 2018/12/27 19:41
 * @Description:
 */
public class Solution572 {


    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s == null && t == null)
            return true;
        if(s == null || t == null)
            return false;
        boolean flag = false;
        if(s.val == t.val){
            flag = isSubtree2(s,t);
        }
        return flag || isSubtree(s.left,t) || isSubtree(s.right,t);
    }

    public boolean isSubtree2(TreeNode s,TreeNode t){
        if(s == null && t == null){
            return true;
        }
        if(s == null || t == null){
            return false;
        }
        if(s.val == t.val)
            return (s.val == t.val) && isSubtree2(s.left,t.left) && isSubtree2(s.right,t.right);
        else
            return false;
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
