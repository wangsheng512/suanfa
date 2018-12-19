package com.wsheng.suanfa.leecode.Int;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: wsheng
 * @Date: 2018/11/13 19:43
 * @Description:
 */
public class Solution412 {


    public static List<String> fizzBuzz(int n){
        List<String> str = new ArrayList<>();
        for (int i=1;i<=n;i++){
                if (i%3==0 && i%5!=0){
                    str.add("Fizz");
                }else if (i%5==0 && i%3!=0){
                    str.add("Buzz");
                }else if (i%3==0&&i%5==0){
                    str.add("FizzBuzz");
                }else {
                    str.add(String.valueOf(i));
            }
        }
        return str;
    }

    public static void main(String[] args) {
        List<String> str1 =  Solution412.fizzBuzz(0);
        System.out.println(str1);
    }

}
