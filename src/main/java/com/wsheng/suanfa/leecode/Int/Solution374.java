package com.wsheng.suanfa.leecode.Int;

/**
 *
     * 374	Guess Number Higher or Lower

 We are playing the Guess Game. The game is as follows:

 I pick a number from 1 to n. You have to guess which number I picked.

 Every time you guess wrong, I’ll tell you whether the number is higher or lower.

 You call a pre-defined API guess(int num) which returns 3 possible results (-1, 1, or 0):

 -1 : My number is lower
 1 : My number is higher
 0 : Congrats! You got it!

 Example :
 Input: n = 10, pick = 6
 Output: 6
 * @Auther: wsheng
 * @Date: 2018/11/3 22:18
 * @Description:
 */
public class Solution374 {

    public static int guessNumber(int n) {
        int low = 1;
        int high = n;
        int res;
        int mid;
        while(high > low){
            mid = low + (high - low) / 2;
            res = guess(mid);
            if(res == 1) low = mid + 1;
            else if(res == -1) high = mid - 1;
            else return mid;
        }
        return low;
    }


    static int guess(int num){
        return num -1;
    }

    public static void main(String[] args) {
        int m = Solution374.guessNumber(10);
        System.out.println(m);
    }
}
