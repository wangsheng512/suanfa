package com.wsheng.suanfa.leecode;

/**
 * @Auther: wsheng
 * @Date: 2018/12/3 19:55
 * @Description:
 */
public class Solution479 {

    public int largestPalindrome(int n) {
        if(n == 1)
            return 9;
        int upper = (int)Math.pow(10,n)-1;
        for(int i = upper; i>upper/10; i--){
            long palin = toPalindrome(i);
            for(int j = upper; j>upper/10; j--){
                if(palin / j > upper)
                    break;
                if(palin % j == 0)
                    return (int)(palin % 1337);
            }
        }
        return -1;
    }
    public long toPalindrome(int i){
        StringBuffer str = new StringBuffer();
        str.append(i+"");
        String a = str.reverse().toString();
        return Long.parseLong(i+""+a);
    }
}
