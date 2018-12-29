package com.wsheng.suanfa.leecode.ArrayList;

/**
 * @Auther: wsheng
 * @Date: 2018/12/26 20:40
 * @Description:
 */
public class Solution566 {


    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int size =  r * c;
        if (size != nums.length * nums[0].length) {
            return nums;
        }
        int[] tmp = new int[size];
        int count = 0;
        for (int i = 0; i < nums.length; ++i) {
            for (int j = 0; j < nums[0].length; ++j) {
                tmp[count] = nums[i][j];
                ++count;
            }
        }
        int[][] res = new int[r][c];
        count = 0;
        for (int i = 0; i < r; ++i) {
            for (int j = 0; j < c; ++j) {
                res[i][j] = tmp[count];
                ++count;
            }
        }
        return res;
    }
}
