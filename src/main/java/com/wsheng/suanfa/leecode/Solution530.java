package com.wsheng.suanfa.leecode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @Auther: wsheng
 * @Date: 2018/12/15 23:36
 * @Description:
 */
public class Solution530 {

/*
    static Stack<Integer> stack = new Stack<>();
    public int getMinimumDifference(TreeNode root) {
        inOrderTraversal(root);
        int min = Integer.MAX_VALUE;
        int prev = stack.pop();
        while (!stack.isEmpty()) {
            int cur = stack.pop();
            min = min > (prev - cur) ? (prev - cur) : min;
            prev = cur;
        }
        return min;
    }
    public static void inOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        stack.push(root.val);
        inOrderTraversal(root.right);
    }*/

    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        get(root,list);
        int mins = Integer.MAX_VALUE;
        for(int i=0;i<list.size()-1;i++){
            for(int j=i+1;j<list.size();j++){
                int value = Math.abs(list.get(i)-list.get(j));
                if(mins>value){
                    mins = value;
                }
            }
        }
        return mins;
    }
    public void get(TreeNode root,ArrayList<Integer> list){
        if(root==null) return ;
        get(root.left,list);
        list.add(root.val);
        get(root.right,list);
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
