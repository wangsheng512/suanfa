package com.wsheng.suanfa.leecode.String;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: wsheng
 * @Date: 2019/2/17 22:06
 * @Description:
 */
public class Solution748 {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        Map<Character, Integer> license = new HashMap<>();
        for (int i = 0; i < licensePlate.length(); i++)
            if (Character.isAlphabetic(licensePlate.charAt(i))) {
                char c = Character.toLowerCase(licensePlate.charAt(i));
                license.put(c, license.getOrDefault(c, 0) + 1);
            }
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                return o1.length() == o2.length() ? 0 :
                        (o1.length() > o2.length() ? 1 : -1);
            }
        });
        for (String word : words) {
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            boolean flag = true;
            for (char key : license.keySet())
                if (!map.containsKey(key) || (map.get(key) < license.get(key))) {
                    flag = false;
                    break;
                }
            if (flag)
                return word;
        }
        return "";
    }
}
