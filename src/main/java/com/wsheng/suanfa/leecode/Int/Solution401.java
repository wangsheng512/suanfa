package com.wsheng.suanfa.leecode.Int;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: wsheng
 * @Date: 2018/11/9 13:47
 * @Description:
 */
public class Solution401 {

    public static List<String> readBinaryWatch1(int num) {
        List<String> times = new ArrayList<String>();
            int[] watch = new int[10];
            Trial(num, 0, watch, times);
            return times;
    }
    public static void Trial(int n,int a,int[] watch,List<String> times){
            if(n==0) {
                String time = "";
                int hour = SumOfIntArray(3, 0, watch);
                time = time + hour + ":";
                int minute = SumOfIntArray(9, 4, watch);
                if(minute<10) time = time+0+minute;
                else time = time + minute;
                times.add(time);
                return;
        }
        for(;a<=9;a++){
            watch[a] = 1;
            if( ! ((watch[0] == 1 && watch[1] == 1) ||
                    (watch[4] == 1 && watch[5] == 1 && watch[6] == 1 && watch[7] == 1))){
                Trial(n-1, a+1, watch, times);
            }
            watch[a]=0;
        }
        return;
    }
    public static int SumOfIntArray(int a,int b,int[] times){
        int sum = 0;
        int mi = 0;
        for(int i=a;i>=b;i--){
            sum = (int) (sum +times[i]*Math.pow(2, mi));
            mi++;
        }
        return sum;
    }

    public static List<String> readBinaryWatch(int num) {
        List<String> times = new ArrayList<>();
        for (int h = 0; h < 12; h++)
            for (int m = 0; m < 60; m++)
                if (Integer.bitCount(h * 64 + m) == num)
                    times.add(String.format("%d:%02d", h, m));
        return times;
    }



    public static void main(String[] args) {
        List<String> nn = Solution401.readBinaryWatch(1);
        System.out.println(nn);
    }
}
