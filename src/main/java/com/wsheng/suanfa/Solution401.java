package com.wsheng.suanfa;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: wsheng
 * @Date: 2018/11/9 13:47
 * @Description:
 */
public class Solution401 {

    public static List<String> readBinaryWatch1(int num) {
        List<String> times = new ArrayList<String>(); //时间集合
        int[] watch = new int[10];  //数组表示灯的位置，下标为 0到3 表示 小时的最高位到最低位
        //下标为4到9表示分钟的最高位到最低位。
        //例如：watch[0]的权是8，watch[3]的权是1，watch[4]的权是32，watch[9]的权是1
        Trial(num, 0, watch, times);
        return times;
    }
    //n代表亮灯的数量，a代表现在可亮灯位置的第一位（最后一位是 9）
    //这个代表的含义是：在位置（以数组下标表示）a到9 可以点亮n盏灯，
    //第一次调用时a=0，代表的意思是在数组下标 0到9 可以点亮n盏灯
    public static void Trial(int n,int a,int[] watch,List<String> times){
        if(n==0) {
            String time = "";
            int hour = SumOfIntArray(3, 0, watch);
            time = time + hour + ":";
            int minute = SumOfIntArray(9, 4, watch);
            if(minute<10) time = time+0+minute;
            else time = time + minute;
            times.add(time);
            return;  //递归返回，这句话关键代码，一定不要忘了！！！
            //但是本程序这行不加不影响，大不了不返回上一层，接着执行，
            //n减小成负数，a不停增加，直到大于9，再逐步返回。
        }
        for(;a<=9;a++){
            watch[a] = 1;//在a位置点亮一盏灯
            //当不是下面这些情况时，递归循环，如果是的话，不进入循环，直接回溯
            if( ! ((watch[0] == 1 && watch[1] == 1) ||
                    (watch[4] == 1 && watch[5] == 1 && watch[6] == 1 && watch[7] == 1))){
                //进入递归循环，子问题的意思是：在位置（以数组下标表示）a+1到9 可以点亮n-1盏灯
                Trial(n-1, a+1, watch, times);
            }
            watch[a]=0; //回溯
        }
        return;
    }
    public static int SumOfIntArray(int a,int b,int[] times){
        //a是低位，b是高位，a是3或9，b是0或4
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
