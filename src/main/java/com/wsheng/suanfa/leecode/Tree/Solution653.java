package com.wsheng.suanfa.leecode.Tree;

import java.util.HashSet;

/**
 * @Auther: wsheng
 * @Date: 2019/1/17 20:56
 * @Description:
 */
public class Solution653 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> hashSet=new HashSet<Integer>();
        return find(root, k, hashSet);
    }

    public boolean find(TreeNode node,int k,HashSet<Integer> hashSet){
        if(node==null){
            return false;
        }
        if(hashSet.contains(k-node.val)){
            return true;
        }
        hashSet.add(node.val);
        return find(node.left, k, hashSet)||find(node.right, k, hashSet);
    }
}
