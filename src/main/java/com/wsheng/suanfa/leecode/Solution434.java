package com.wsheng.suanfa.leecode;

/**
 * @Auther: wsheng
 * @Date: 2018/11/18 17:59
 * @Description:
 */
public class Solution434 {

    public static int countSegments(String s) {
        String trimmed = s.trim();
        if (trimmed.length() == 0)
            return 0;
        else
            return trimmed.split("\\s+").length;
    }

    public static int countSegments2(String s) {
        s = s.trim();
        if (s.length() == 0)
            return 0;
        if (s.length() == 1) {
            if (s == " ")
                return 0;
            return 1;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == ' ' && s.charAt(i + 1) == ' ') {
                s = s.substring(0, i) + s.substring(i + 1);
                i--;
            }
        }
        return s.split(" ").length;
    }



    public static void main(String[] args) {
        String m = "Hello, my name is John";
        int s = Solution434.countSegments2(m);
        System.out.println(s);
    }
}
