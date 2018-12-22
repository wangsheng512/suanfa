package com.wsheng.suanfa.leecode.Tree;

/**
 * @Auther: wsheng
 * @Date: 2018/11/16 23:00
 * @Description:
 */
public class Solution427 {

    public Node construct(int[][] grid) {
        return construct(grid,0,0,grid.length);
    }
    public Node construct(int[][] grid, int r, int c, int ss) {

        int target = grid[r][c];
        for(int i=r; i<r+ss; i++) {
            for(int j=c; j<c+ss; j++) {
                if(target != grid[i][j]) {
                    return new Node(true, false,
                            construct(grid,r,     c     , ss/2),
                            construct(grid,r,     c+ss/2, ss/2),
                            construct(grid,r+ss/2,c     , ss/2),
                            construct(grid,r+ss/2,c+ss/2, ss/2));
                }
            }
        }
        return new Node((target == 1) ? true : false, true, null, null, null, null);
    }


    class Node {
        public boolean val;
        public boolean isLeaf;
        public Node topLeft;
        public Node topRight;
        public Node bottomLeft;
        public Node bottomRight;

        public Node() {
        }

        public Node(boolean _val, boolean _isLeaf, Node _topLeft, Node _topRight, Node _bottomLeft, Node _bottomRight) {
            val = _val;
            isLeaf = _isLeaf;
            topLeft = _topLeft;
            topRight = _topRight;
            bottomLeft = _bottomLeft;
            bottomRight = _bottomRight;
        }
    }

}
