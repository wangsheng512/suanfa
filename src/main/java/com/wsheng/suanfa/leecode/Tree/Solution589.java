package com.wsheng.suanfa.leecode.Tree;

import java.util.LinkedList;
import java.util.List;

/**
 * @Auther: wsheng
 * @Date: 2018/12/30 21:08
 * @Description:
 */
public class Solution589 {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    /**
     * 递归
     * @param root
     * @return
     */
    public List<Integer> preorder(Node root) {
        List<Integer> res = new LinkedList<>();
        prehel(root,res);
        return res;
    }

    public void prehel(Node root,List<Integer> res) {
        if(root == null) return;
        List<Node> child = root.children;
        res.add(root.val);
        for(Node ele:child) prehel(ele,res);
    }

    /**
     * //用于返回结果
     List<Integer> res = new LinkedList<>();
     //用于回退
     Stack<Node> stack = new Stack<>();
     //判断节点是否遍历过，如果遍历过，指针就要往后挪动一位，并且以此来改变pos
     Map<Node,Integer> map = new HashMap<>();


     //对两种特殊情况先进行处理
     if(root == null) return res;
     if(root.children.size() == 0) {
     res.add(root.val);
     return res;
     }

     Node tmp = root;
     int pos = -1;

     while(!stack.isEmpty() || tmp != null) {
     //判断当前节点的孩子是否存在，如果存在就要对孩子进行遍历
     if(tmp.children.size()>0) {
     if(!map.containsKey(tmp)) {
     res.add(tmp.val);
     map.put(tmp,0);
     pos = 0;
     }else {
     map.put(tmp,map.get(tmp)+1);
     pos = map.get(tmp);
     }
     stack.add(tmp);
     if(pos<tmp.children.size())
     tmp = tmp.children.get(pos);
     else {
     stack.pop();
     if(!stack.isEmpty())
     tmp = stack.pop();
     else
     break;
     }
     }else {
     res.add(tmp.val);
     tmp = stack.pop();
     }
     }

     return res;
     */

}
