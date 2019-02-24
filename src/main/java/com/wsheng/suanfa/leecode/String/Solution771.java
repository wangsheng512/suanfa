package com.wsheng.suanfa.leecode.String;


import java.util.HashSet;
import java.util.Set;

/**
 * @Auther: wsheng
 * @Date: 2019/2/20 21:37
 * @Description:
 */
public class Solution771 {


    public int numJewelsInStones(String J, String S) {
        int sum = 0;
        Set set = new HashSet();
        for(char c:J.toCharArray()){
            set.add(c);
        }
        for(char s : S.toCharArray()){
            if(set.contains(s)){
                sum++;
            }
        }
        return sum;
    }
}
