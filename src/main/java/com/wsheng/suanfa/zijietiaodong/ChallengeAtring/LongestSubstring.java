package com.wsheng.suanfa.zijietiaodong.ChallengeAtring;


import org.omg.PortableInterceptor.INACTIVE;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @Auther: wsheng
 * @Date: 2018/12/5 22:24
 * @Description:
 */
public class LongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        if (s.length()==0) return 0;
        TreeMap<Character,Integer> map = new TreeMap<>();
        int max = 0;
        for (int i=0,j=0;i<s.length();++i){
            if (map.containsKey(s.charAt(i))){
                j=Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
       return max;
    }

    public static void main(String[] args) {
        TreeMap<Integer ,Integer> map = new TreeMap<>();
        map.put(1,2);
        map.put(2,4);
        map.put(7,9);
        Iterator iterator = map.entrySet().iterator();
        int key = 0;
        int value = 0;
        while (iterator.hasNext()){
            Map.Entry ent = (Map.Entry)iterator.next();
            key = (Integer) ent.getKey();
//            key = (Integer) iterator.next();
//            value = map.get(key);
            value =(Integer) ent.getValue();
            System.out.println("jian:"+key+"zhi:"+value);
        }
    }
}
