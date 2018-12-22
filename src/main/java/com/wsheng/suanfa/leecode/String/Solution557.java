package com.wsheng.suanfa.leecode.String;

/**
 * @Auther: wsheng
 * @Date: 2018/12/21 22:27
 * @Description:
 */
public class Solution557 {

    public static String reverseWords(String s) {
        String[] strings = s.split(" ");
        StringBuffer stringBuffer = new StringBuffer();
        for (int i=0;i<strings.length;i++){
            StringBuffer stringBuffer1 = new StringBuffer(strings[i]);
            stringBuffer1.reverse();
            stringBuffer.append(stringBuffer1);
            if (i < strings.length-1){
                stringBuffer.append(" ");
            }
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        String ss = Solution557.reverseWords("Let's take LeetCode contest");
        System.out.println(ss);
    }
}
