package com.wsheng.suanfa.leecode;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
     * 429. N-ary Tree Level Order Traversal

     Given an n-ary tree, return the level order traversal of its nodes’ values. (i.e., from left to right, level by level).

     For example, given a 3-ary tree:

     此处参考leetcode原题图片

     We should return its level order traversal:
     [
         [1],
         [3,2,4],
         [5,6]
     ]
     Note:
     The depth of the tree is at most 1000.
     The total number of nodes is at most 5000.
 * @Auther: wsheng
 * @Date: 2018/11/17 23:11
 * @Description:
 */
public class Solution429 {


    public List<List<Integer>> levelOrder(Node root) {

        List<List<Integer>> res = new LinkedList<>();
        if(root == null) return res;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int levelNum = queue.size();
            List<Integer> tmp = new LinkedList<>();
            for(int i = 0;i < levelNum;i++) {
                if(queue.peek().children.size()>0) {
                    for(Node ele:queue.peek().children) queue.add(ele);
                }
                tmp.add(queue.poll().val);
            }
            res.add(tmp);
        }
        return res;
    }

    class Node {
        public int val;
        public List<Node> children;
        public Node() {}
        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

}
