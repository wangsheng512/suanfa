package com.wsheng.suanfa.leecode;


/**
 * @Auther: wsheng
 * @Date: 2018/11/28 20:41
 * @Description:
 */
public class Solution459 {

    public static boolean repeatedSubstringPattern(String str) {
        if (str == null || str.length() <= 1) {
            return false;
        }
        int len = str.length();
        for(int i=1;i<=len/2;i++) {
            if(len%i == 0) {
                String tem = str.substring(0, i);
                StringBuffer sb = new StringBuffer();
                for(int j=0;j<len/i;j++) {
                    sb = sb.append(tem);
                }
                if(sb.toString().equals(str))
                    return true;
            }
        }
        return false;
    }




    public static void main(String[] args) {
       boolean s = Solution459.repeatedSubstringPattern("abc");
       System.out.println(s);
    }
}
