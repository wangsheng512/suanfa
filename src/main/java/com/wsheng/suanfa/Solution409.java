package com.wsheng.suanfa;

/**
 * @Auther: wsheng
 * @Date: 2018/11/12 17:16
 * @Description:
 */
public class Solution409 {

    public static int longestPalindrome(String s) {
        int[] hash1 = new int[26];
        int[] hash2 = new int[26];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' &&
            s.charAt(i) <= 'z'){
                hash1[s.charAt(i) - 'a']++;
            }else{
                hash2[s.charAt(i) - 'A']++;
            }
        }
        int odds = 0;
        for (int i = 0; i < 26; i++) {
            if (hash1[i] % 2 == 1) odds++;
            if (hash2[i] % 2 == 1) odds++;
        }
        if (odds == 0) return s.length();
        return s.length() - odds + 1;
    }

    public static void main(String[] args) {
        int s = Solution409.longestPalindrome("abccccdd");
        System.out.println(s);
    }
}
