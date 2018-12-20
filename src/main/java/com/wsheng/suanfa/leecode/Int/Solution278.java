package com.wsheng.suanfa.leecode.Int;

/**
 * @Auther: wsheng
 * @Date: 2018/10/22 20:27
 * @Description:
 */
public class Solution278 {

    public int firstBadVersion(int n){


        int low=1, high=n;
        while(low<high) {

            //int mid=low + (high-low)/2;
            int mid=low + (high-low) >> 1;
            if(isBadVersion(mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    static boolean isBadVersion(int version){
        return true;
    }

}
