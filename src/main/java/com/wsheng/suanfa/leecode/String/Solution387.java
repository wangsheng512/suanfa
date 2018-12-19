package com.wsheng.suanfa.leecode.String;

import java.util.HashMap;

/**
 * 387	First Unique Character in a String

 Given a string, find the first non-repeating character in it and return it’s index. If it doesn’t exist, return -1.

 Examples:
 s = “leetcode”
 return 0.

 s = “loveleetcode”,
 return 2.
 Note: You may assume the string contain only lowercase letters.
 * @Auther: wsheng
 * @Date: 2018/11/5 21:49
 * @Description:
 */
public class Solution387 {

    //利用HashMap,键存放字符，值存放字符出现的次数
    // 第一次遍历把所有的字符存放到表中
    // 第二次遍历寻找第一次只出现一次的字符
    public int firstUniqChar(String st){
        HashMap<Character, Integer> map = new HashMap<>();
        char[] str = st.toCharArray();
        for(int i=0;i<str.length;i++) {
            if(map.containsKey(str[i])) {
                map.put(str[i], map.get(str[i])+1);
            }else {
                map.put(str[i],1);
            }
        }
        for(int i=0;i<str.length;i++) {
            if(map.get(str[i]) == 1)
                return i;
        }
        return -1;
    }

    //第二种方法，利用数组，26个字母，可以存放在一个有26个元素的数组里，a~z分别对应下标0~25，值为字符出现次数。
    public static  int firstUniqChar2(String s) {
            int []a=new int[26];
            char []ch=s.toCharArray();
            for(int i=0;i<s.length();i++)
                a[(int)(ch[i]-'a')]++;
            for(int i=0;i<s.length();i++) {
                if(a[(int)(ch[i]-'a')]==1)
                    return i;
            }
            return -1;
        }
}


