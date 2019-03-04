package com.wsheng.suanfa.leecode.ArrayList;

import java.util.HashSet;
import java.util.Set;

/**
 * @Auther: wsheng
 * @Date: 2019/3/3 22:17
 * @Description:
 */
public class Solution824 {

    public String toGoatLatin(String S) {
        String[] words = S.split(" ");
        String as = "";
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        for (int i = 0; i < words.length; i++) {
            as += "a";
            char first = words[i].charAt(0);
            if (set.contains(first)) {
                sb.append(words[i]+"ma"+as+" ");
            } else {
                sb.append(words[i].substring(1)+first+"ma"+as+" ");
            }
        }
        return sb.toString().trim();
    }
}
