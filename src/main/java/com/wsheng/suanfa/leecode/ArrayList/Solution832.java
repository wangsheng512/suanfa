package com.wsheng.suanfa.leecode.ArrayList;

/**
 * @Auther: wsheng
 * @Date: 2019/3/4 22:37
 * @Description:
 */
public class Solution832 {


        public static int[][] flipAndInvertImage(int[][] A) {
            for(int i=0;i<A.length;i++){
                for(int j=0;j<A[i].length/2;j++){
                    int temp= A[i][j];
                    A[i][j]=A[i][A[i].length-1-j];
                    A[i][A[i].length-1-j]=temp;
                }
                for(int j=0;j<A[i].length;j++){
                    if(A[i][j]==1)A[i][j]=0;
                    else A[i][j]=1;
                }
            }
            return A;
        }


}
