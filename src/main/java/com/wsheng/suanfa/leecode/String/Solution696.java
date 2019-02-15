package com.wsheng.suanfa.leecode.String;

/**
 * @Auther: wsheng
 * @Date: 2019/1/30 21:37
 * @Description:
 */
public class Solution696 {

    public static int countBinarySubstrings(String s) {
        int res = 0;
        //遍历每个字符
        for(int i=0; i<s.length(); i++){
            //记录0或者1的个数
            int count=0, j;
            //是否出现两种字符的标志
            boolean flag = false;
            //遍历i之后的字符，寻找符合条件的子串
            for(j=i; j<s.length()-1; j++) {
                if (!flag) {//说明是前面连续出现的0或者1，如果前后两个字符相等那么就把count++，否则说明出现了第二个字符，把flag置为true；
                    if (s.charAt(j) == s.charAt(j + 1))
                        count++;
                    else {
                        flag = true;
                        count++;
                    }
                }else{//说明已经出现了两种字符，这时如果前后两个字符相等，就把count--，直到count变成0，说明找到了0和1个数相等的连续子串，如果不相等那么就直接返回，说明对于本字符没有符合条件的子串
                    if(s.charAt(j) == s.charAt(j+1)) {
                        count--;
                        if(count == 0)break;
                    }
                    else {
                        count --;
                        break;
                    }
                }
            }

            //如果count==0且flag为真（这个条件是为了避免最后一个字符没有执行内循环直接返回的情况，那时count肯定为0，但是flag为false）则res+1。
            if(count == 0 && flag)
                res++;

            //因为最后一个字符没有办法遍历到，所以添加这么一个条件，当最后一个字符与前面字符相等且count为1时，表明也是满足条件的子串
            if(flag && j == s.length()-1 && count == 1)
                res ++;

        }
        return res;
    }

}
