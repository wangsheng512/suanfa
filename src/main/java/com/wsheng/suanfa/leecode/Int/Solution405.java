package com.wsheng.suanfa.leecode.Int;

/**
 * @Auther: wsheng
 * @Date: 2018/11/11 19:48
 * @Description:
 */
public class Solution405 {

    public static String toHex(int num) {
        if(num<10 && num>=0) return Integer.toString(num);
        char[] hex = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<8 && num!=0;i++) {
            sb.insert(0,hex[num & 15]);
            num = num>>4;
        }
        return sb.toString();
    }


    public static String toHex1(int num) {
        char[] chars = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        if(num == 0) return "0";
        String result = "";
        while(num != 0){
            result = chars[(num & 0xF)] + result;
            num = (num >>> 4);
        }
        return result;

    }

    public static void main(String[] args) {

    }
}
