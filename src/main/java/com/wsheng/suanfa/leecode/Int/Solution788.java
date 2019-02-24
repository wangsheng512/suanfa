package com.wsheng.suanfa.leecode.Int;

/**
 * @Auther: wsheng
 * @Date: 2019/2/24 13:25
 * @Description:
 */
public class Solution788 {

    public int rotatedDigits(int N) {
        int count = 0;
        for(int i=1;i<=N;i++){
            String str = String.valueOf(i);
            if((str.contains("2")||str.contains("5")||str.contains("6")||str.contains("9"))&&(!str.contains("3")&&!str.contains("4")&&!str.contains("7")))
                count++;
        }
        return count;
    }


    public int rotatedDigits2(int N) {
        int result = 0;
        lala:
        for (int i = 1; i <= N; i++) {
            String s = String.valueOf(i);
            boolean b = false;
            for (char c : s.toCharArray()) {
                if (c != '0' && c != '1' && c != '8'
                        && c != '2' && c != '5' && c != '6' && c != '9')
                    continue lala;
                if (c == '2' || c == '5' || c == '6' || c == '9')
                    b = true;
            }
            if (b) result++;
        }
        return result;
    }
}
