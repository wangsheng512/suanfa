package com.wsheng.suanfa.leecode.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: wsheng
 * @Date: 2018/12/31 23:10
 * @Description:
 */
public class Solution590 {

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public  List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        postorder(root, result);
        return result;
    }

    private void postorder(Node root, List<Integer> result) {
        if (root == null) return;
        if (root.children != null) {
            for (Node tmp : root.children) {
                postorder(tmp, result);
            }
        }
        result.add(root.val);
    }
}
