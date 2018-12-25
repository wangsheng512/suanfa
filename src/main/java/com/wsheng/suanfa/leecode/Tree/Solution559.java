package com.wsheng.suanfa.leecode.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: wsheng
 * @Date: 2018/12/23 21:39
 * @Description:
 */
public class Solution559 {

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public int maxDepth(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null ) { return 0;}
        int res = 1;
        for (Node node : root.children) {
            res = Math.max(res, maxDepth(node) + 1);
        }
        return res;
    }
}
