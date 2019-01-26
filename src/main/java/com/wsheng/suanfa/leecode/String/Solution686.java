package com.wsheng.suanfa.leecode.String;

/**
 * @Auther: wsheng
 * @Date: 2019/1/25 22:48
 * @Description:
 */
public class Solution686 {

    /**
     * 我这个思路就比较偷懒了，直接就用indexOf来查找了，不过要注意的是加入A的长度是B的5倍的话，那么B有可能最多重复7次才拼出来A，
     * 这个我个人总结的啦，因为涉及到整数除法下取整还有头尾的问题。
     * @param A
     * @param B
     * @return
     */


    public int repeatedStringMatch(String A, String B) {
        StringBuilder sb = new StringBuilder();
        int lenghtA = A.length();
        int lenghtB = B.length();
        for(int i=0;i<lenghtB/lenghtA + 2;i++){
            String str = sb.append(A).toString();
            if(str.indexOf(B) != -1)
                return i+1;
        }
        return -1;
    }
}
