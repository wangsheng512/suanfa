package com.wsheng.suanfa.leecode;

/**
 * @Auther: wsheng
 * @Date: 2018/12/10 19:24
 * @Description:
 */
public class Solution504 {

    public String convertToBase7(int num) {
        return Integer.toString(num, 7).toString();
    }

    public String convertToBase7Two(int num) {
        StringBuilder sb= new StringBuilder();
        boolean flag=num<0;
        if(flag) num=-num;
        while (num>=7){
            sb.append(num%7);
            num/=7;
        }
        sb.append(num);
        if(flag)sb.append('-');
        return sb.reverse().toString();
    }

    public String convertToBase7Three(int num) {
        if (num < 0) return "-" + convertToBase7(-num);
        if (num < 7) return String.valueOf(num);
        return convertToBase7(num / 7) + String.valueOf(num % 7);
    }
}
