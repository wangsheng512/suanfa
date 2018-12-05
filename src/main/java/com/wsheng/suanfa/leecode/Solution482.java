package com.wsheng.suanfa.leecode;

/**
 * @Auther: wsheng
 * @Date: 2018/12/4 19:59
 * @Description:
 */
public class Solution482 {

    public static String licenseKeyFormatting(String S, int K) {
        char[] ss = S.toCharArray();
        String result = "";
        StringBuffer stringBuffer = new StringBuffer(result);
        int length = 0;
        for (int i = ss.length-1; i >= 0; i--) {
            stringBuffer.append(ss[i]);
            length ++;
            if (length == K) {
                stringBuffer.append('-');
                length = 0;
            }
        }
        if (stringBuffer.length() > 0 && stringBuffer.charAt(stringBuffer.length()-1) - '-' == 0)
            stringBuffer.delete(stringBuffer.length()-1, stringBuffer.length());
        stringBuffer.reverse();
        result = stringBuffer.toString();
        return result;
    }

    public String licenseKeyFormatting1(String S, int K) {
        StringBuilder sb = new StringBuilder();
        char[] arr = S.toCharArray();
        int count = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            char c = arr[i];
            if (c == '-') continue;
            if (count % K == 0) sb.insert(0, '-');
            if (c >= 'a' && c <= 'z') c -= 32;
            sb.insert(0, c);
            count++;
        }
        return sb.length() > 0 ? sb.substring(0, sb.length() - 1) : "";
    }

    public static void main(String[] args) {
        String ss = "sss";
        StringBuffer stringBuffer = new StringBuffer();
        char[] c = ss.toCharArray();
        for (int i = c.length-1;i>=0;i--){
            c[i] = (char)(c[i]-32);
            stringBuffer.append(c[i]);
        }
        String aa = "2-4A0r7-4k";
        StringBuffer stringBuffer1 = new StringBuffer(aa);
        stringBuffer1.reverse();
        System.out.println(stringBuffer1.toString());
        System.out.println(stringBuffer.toString());
    }
}
