package com.wsheng.suanfa.leecode.String;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: wsheng
 * @Date: 2018/10/24 20:42
 * @Description:
 */
public class Solution290 {

    public boolean wordPattern(String pattern, String str) {

        String[] words = str.split(" ");

        if (words.length != pattern.length())

            return false;

        Map index = new HashMap();

        for (Integer i=0; i<words.length; ++i){

            if (index.put(pattern.charAt(i), i) != index.put(words[i], i))

                return false;
        }
        return true;
    }


}
