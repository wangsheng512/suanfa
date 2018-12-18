package com.wsheng.suanfa.leecode;

import java.util.Stack;

/**
 * @Auther: wsheng
 * @Date: 2018/12/18 20:29
 * @Description:
 */
public class Solution541 {


    public String reverseStr(String s, int k) {
        int len = s.length();
        String result = "";
        for (int i = 0; i < len; i += 2 * k) {
            if (len - i < k) {
                String temp = reverse(s.substring(i, len));
                result += temp;
            }
            else if (len - i < 2 * k && len - i >= k) {
                String temp =  reverse(s.substring(i, i + k));
                result += temp + s.substring(i + k, len);
            }
            else {
                String temp = reverse(s.substring(i, i + k));
                result += temp + s.substring(i + k, i + 2 * k);
            }
        }
        return result;
    }
    public String reverse(String s) {
        String result = "";
        int len = s.length();
        for (int i = 0; i < len; i++)
            result = s.charAt(i) + result;
        return result;
    }


    public String reverseStr2(String s, int k) {
        char[] data = s.toCharArray();
        int len = data.length;
        int index = 0;
        while(index < len){
            if((len - index) > k){
                for(int i = index,j = index+k-1; i < j; i++,j--){
                    char tmp = data[i];
                    data[i] = data[j];
                    data[j] = tmp;
                }
                index = index + 2*k;
            }else{
                for(int i = index,j = len-1; i < j; i++,j--){
                    char tmp = data[i];
                    data[i] = data[j];
                    data[j] = tmp;
                }
                index = len;
            }
        }
        return String.valueOf(data);
    }

}
