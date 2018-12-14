package com.wsheng.suanfa.leecode;

/**
 * @Auther: wsheng
 * @Date: 2018/12/14 17:51
 * @Description:
 */
public class Solution520 {
    public static boolean detectCapitalUse(String word) {
        if (word.length() == 1) return true;
        char[] chars = word.toCharArray();
        if (65 <= chars[0] && chars[0] <= 90) {
            boolean is = false;
            if (65 <= chars[1] && chars[1] <= 90)
                is = true;
            for (int i = 2; i < chars.length; i++) {
                if (is) {
                    if (97 <= chars[i] && chars[i] <= 122) return false;
                } else {
                    if (65 <= chars[i] && chars[i] <= 90) return false;
                }
            }
        } else {
            for (int i = 0; i < chars.length; i++) {
                if (65 <= chars[i] && chars[i] <= 90) return false;
            }
        }
        return true;
    }
}
