package com.wsheng.suanfa.leecode.String;

/**
 * @Auther: wsheng
 * @Date: 2019/3/3 22:14
 * @Description:
 */
public class Solution821 {


    public int[] shortestToChar(String S, char C) {
        int len = S.length();
        int [] result = new int[len];
        int temp = 10001;
        for(int i=0;i<len;i++){
            char t = S.charAt(i);
            if(t==C){
                temp = 0;
            }else{
                temp++;
            }
            result[i] = temp;
        }
        temp = 10001;
        for(int i=len-1;i>=0;i--){
            char t = S.charAt(i);
            if(t==C){
                temp = 0;
            }else{
                temp++;
            }

            if(result[i]>temp){
                result[i] = temp;
            }
        }
        return result;
    }
}
