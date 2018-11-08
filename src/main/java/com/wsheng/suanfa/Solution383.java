package com.wsheng.suanfa;

/**
 * 383 Ransom Note

 Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.

 Each letter in the magazine string can only be used once in your ransom note.

 Note:
 You may assume that both strings contain only lowercase letters.

 canConstruct(“a”, “b”) -> false
 canConstruct(“aa”, “ab”) -> false
 canConstruct(“aa”, “aab”) -> true
 * @Auther: wsheng
 * @Date: 2018/11/5 21:20
 * @Description:
 */
public class Solution383 {

    //这个方法是先遍历magazine,以字母为新数组的索引,以出现的次数为数组的值。然后再遍历ransom,根据ransom中的值去新数组count中去找
    //并对count的值减一,然后判断count的值是否大于0

    public static boolean canConstruct(String ransomNote ,String magazine){

        int[] count = new int['a' + 26];
        char[] m = magazine.toCharArray();
        char[] r = ransomNote.toCharArray();
        for(char c : m) count[c] ++;
        for(char c : r){
            if(--count[c] < 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean a = Solution383.canConstruct("a","b");
        System.out.println(a);
    }
}
