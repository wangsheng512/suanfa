package com.wsheng.suanfa.leecode;

/**
 * 递归
 * @Auther: wsheng
 * @Date: 2018/11/20 23:05
 * @Description:
 */
public class Digui {

    public static int sum(int[] arr){
        return sum(arr,0);
    }

    private static int sum(int[] arr ,int l){
        if (l == arr.length)
            return 0;
        return arr[l] + sum(arr,l+1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int sum = 0;
        for (int a : arr){
             sum += a;
        }
        System.out.println(sum);
        System.out.println(Digui.sum(arr));
    }
}
