package com.wsheng.suanfa.leecode.ArrayList;

/**
 * @Auther: wsheng
 * @Date: 2019/1/19 23:03
 * @Description:
 */
public class Solution661 {

    public int[][] imageSmoother(int[][] M) {
        int r=M.length,c=M[0].length;
        int[][] newM=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int sum=0;
                int count=0;
                for(int x=Math.max(0,i-1);x<=Math.min(r-1,i+1);x++){
                    for(int y=Math.max(0,j-1);y<=Math.min(c-1,j+1);y++){
                        sum+=M[x][y];
                        count++;
                    }
                }
                newM[i][j]=sum/count;
            }
        }
        return newM;
    }
}
