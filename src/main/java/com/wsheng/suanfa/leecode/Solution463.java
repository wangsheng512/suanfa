package com.wsheng.suanfa.leecode;

/**
 * @Auther: wsheng
 * @Date: 2018/11/30 14:00
 * @Description:
 */
public class Solution463 {

    public int islandPerimeter(int[][] grid) {

        int count = 0;//record the value of the answer
        for(int i = 0;i < grid.length;i++){
            for(int j = 0;j < grid[0].length;j++){
                if(grid[i][j] == 1){
                    count += 4;
                }
                if(grid[i][j] == 1 && i - 1 >= 0 && grid[i - 1][j] == 1){
                    count -= 2;
                }
                if(grid[i][j] == 1 && j - 1 >= 0 && grid[i][j - 1] == 1){
                    count -= 2;
                }
            }
        }
        return count;
    }

}
