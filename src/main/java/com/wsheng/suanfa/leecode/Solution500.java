package com.wsheng.suanfa.leecode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: wsheng
 * @Date: 2018/12/8 15:30
 * @Description:
 */
public class Solution500 {

    public static String[] findWords(String[] words) {
        String[] str = {"QWERTYUIOP", "ASDFGHJKL", "ZXCVBNM"};
        List<String> res = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            for (char c : str[i].toCharArray()) {
                map.put(c, i);
            }
        }
        int index;
        for (String word : words) {
            index = map.get(word.toUpperCase().toCharArray()[0]);
            for (char c : word.toUpperCase().toCharArray()) {
                if (map.get(c) != index) {
                    index = -1;
                    break;
                }
            }
            if (index != -1) {
                res.add(word);
            }
        }
        return res.toArray(new String[res.size()]);
    }

    public static void main(String[] args) {
        String[] ss =  Solution500.findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"});
        for (String aa : ss){
            System.out.println(aa);
        }
    }
}

