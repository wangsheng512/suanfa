package com.wsheng.suanfa.leecode.String;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * @Auther: wsheng
 * @Date: 2019/1/17 21:10
 * @Description:
 */
public class Solution657 {
    public boolean judgeCircle(String moves) {
        char[] m = moves.toCharArray();
        TreeMap<Character , Integer> map = new TreeMap<>();
        map.put('U' , 0);
        map.put('D' , 0);
        map.put('L' , 0);
        map.put('R' , 0);
        for (Character c : m ){
            map.put(c , map.get(c) +1);
        }
        return map.get('U').equals(map.get('D')) && map.get('L').equals(map.get('R'));
    }
}
