package com.wsheng.suanfa.leecode.ArrayList;

/**
 * @Auther: wsheng
 * @Date: 2019/2/19 23:17
 * @Description:
 */
public class Solution766 {

    public boolean isToeplitzMatrix(int[][] matrix) {
        for(int i=0;i<matrix.length-1;i++){
            for(int j=0;j<matrix[0].length-1;j++){
                if(matrix[i][j] != matrix[i+1][j+1]){
                    return false;
                }
            }
        }
        return true;
    }
}
