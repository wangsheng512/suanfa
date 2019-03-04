package com.wsheng.suanfa.leecode.ArrayList;

/**
 * @Auther: wsheng
 * @Date: 2019/2/27 22:38
 * @Description:
 */
public class Solution806 {

    public int[] numberOfLines(int[] widths, String S) {
        int[] result = {0, 0} ;
        char[] ch = S.toCharArray() ;
        int len = ch.length ;
        int space = 0 ;
        for (int i = 0; i <= len - 1; i ++){
            if (100 - space >= widths[ch[i] - 'a']){
                space +=  widths[ch[i] - 'a'];
            }
            else{
                result[0] += 1 ;
                space = widths[ch[i] - 'a'] ;
            }
        }
        result[0] += 1 ;
        result[1] = space ;
        return result ;
    }
}
