package com.wsheng.suanfa;

/**
 * @Auther: wsheng
 * @Date: 2018/10/30 16:15
 * @Description:
 */
public class Solution345 {

    public String reverseVowels(String s) {
        String vowels = "aoeiuAOEIU";
        char[] a = s.toCharArray();
        int i = 0;
        int j = a.length - i - 1;
        while (i < j) {
            while (i < j && !vowels.contains(a[i] + "")) {
                i++;
            }
            while (i < j && !vowels.contains(a[j] + "")) {
                j--;
            }
            if (i < j) {
                char c = a[i];
                a[i++] = a[j];
                a[j--] = c;
            }
        }

        return new String(a);
    }

}
