package com.wsheng.suanfa;

/**
 * @Auther: wsheng
 * @Date: 2018/10/29 15:28
 * @Description:
 */
public class Solution344 {

    public static String reverseString(String str){
        return new StringBuffer(str).reverse().toString();
    }

    public static void main(String[] args) {
        String m = Solution344.reverseString("A man, a plan, a canal: Panama");
        System.out.println(m);
    }
}
