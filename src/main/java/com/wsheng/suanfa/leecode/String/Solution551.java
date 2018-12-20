package com.wsheng.suanfa.leecode.String;



/**
 * @Auther: wsheng
 * @Date: 2018/12/20 21:18
 * @Description:
 */
public class Solution551 {


    public static boolean checkRecord(String s) {
        int i = 0;
        int a = 0;
        int l = 0;
        while (i<s.length()){
            char ch = s.charAt(i);
            if (ch == 'A'){
                l = 0;
                a++;
                if (a>1){
                    return false;
                }
            }else if (ch == 'P'){
                l = 0;
            }else {
                l++;
                if (l>2) return false;
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean s = Solution551.checkRecord("LALL");
        System.out.println(s);
    }

}
