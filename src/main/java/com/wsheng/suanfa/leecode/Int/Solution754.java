package com.wsheng.suanfa.leecode.Int;

/**
 * @Auther: wsheng
 * @Date: 2019/2/17 22:10
 * @Description:
 */
public class Solution754 {

    public int reachNumber(int target){
        int posTarget = Math.abs(target);
        int sum = 0;
        int steps = 0;
        while(sum < posTarget){
            steps++;
            sum += steps;
            if(sum == posTarget) return steps;
            if(sum > posTarget){
                int dif = sum - posTarget;
                if(dif % 2 == 0) return steps;

                steps++;
                if(steps % 2 != 0) return steps;
                else return ++steps;
            }
        }
        return steps;
    }
}
