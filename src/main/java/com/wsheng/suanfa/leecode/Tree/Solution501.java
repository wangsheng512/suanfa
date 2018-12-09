package com.wsheng.suanfa.leecode.Tree;

import java.util.*;

/**
 * @Auther: wsheng
 * @Date: 2018/12/9 21:55
 * @Description:
 */
public class Solution501 {

    public int[] findMode(TreeNode root) {
        List<Integer> res = inorderTraversal(root);
        int size = res.size();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < size; i++) {
            int tmp = res.get(i);
            if (map.containsKey(tmp))
                map.put(tmp, map.get(tmp) + 1);
            else
                map.put(tmp, 1);
        }
        Set<Integer> set = map.keySet();
        Iterator<Integer> it = set.iterator();
        int max = Integer.MIN_VALUE, i = 0;
        Set<Integer> sets = new HashSet<Integer>();
        while (it.hasNext()) {
            Integer temp = it.next();
            if (map.get(temp) > max) {
                sets.clear();
                sets.add(temp);
                max = map.get(temp);
            }
            else if (map.get(temp) == max)
                sets.add(temp);
        }
        it = sets.iterator();
        int[] result = new int[sets.size()];
        while(it.hasNext()){
            result[i] = it.next();
            i++;
        }
        return result;
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if (root == null)
            return result;
        if (root.left != null) {
            List<Integer> res = inorderTraversal(root.left);
            result.addAll(res);
        }
        result.add(root.val);
        if (root.right != null) {
            List<Integer> res = inorderTraversal(root.right);
            result.addAll(res);
        }
        return result;
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
