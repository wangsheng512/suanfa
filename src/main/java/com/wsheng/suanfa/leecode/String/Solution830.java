package com.wsheng.suanfa.leecode.String;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: wsheng
 * @Date: 2019/3/3 22:21
 * @Description:
 */
public class Solution830 {

    public List<List<Integer>> largeGroupPositions(String S) {
        char[] array = S.toCharArray();
        List<List<Integer>> lists = new ArrayList<>();
        if (array.length <= 0) return lists;
        int start = 0;
        int end = 0;
        while (end < array.length) {
            while (end < array.length && array[end] == array[start]) {
                end++;
            }
            if (end-start >= 3){
                List<Integer> list = new ArrayList<>();
                list.add(start);
                list.add(end-1);
                lists.add(list);
            }
            start = end;
        }
        return lists;
    }
}
