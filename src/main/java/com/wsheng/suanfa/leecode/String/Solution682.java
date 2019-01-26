package com.wsheng.suanfa.leecode.String;

/**
 * @Auther: wsheng
 * @Date: 2019/1/24 21:04
 * @Description:
 */
public class Solution682 {
        public int calPoints(String[] ops) {
            //给定字符串数组，每个对应的关系如题上所述，你需要返回最后的得分之和
            //思路：使用数组实现
            if (ops.length == 0) return 0;

            int sum = 0;
            int[] nums = new int[ops.length];
            //和数组中的游标
            int index = 0;
            for (int i = 0; i < ops.length; i++) {
                //取第一个符号
                char op = ops[i].toCharArray()[0];
                switch (op) {
                    case '+':
                        //两和相加
                        int numP=nums[index - 1] + nums[index - 2];
                        nums[index++] = numP;
                        break;
                    case 'D':
                        int numD=nums[index-1]*2;
                        nums[index++] = numD;
                        break;
                    case 'C':
                        nums[--index] = 0;
                        break;
                    default:
                        //数字
                        nums[index++] = Integer.parseInt(ops[i]);
                        break;
                }
            }
            //将结果求和
            for (int j = 0; j < nums.length; j++) {
                sum += nums[j];
            }

            return sum;
        }
}
