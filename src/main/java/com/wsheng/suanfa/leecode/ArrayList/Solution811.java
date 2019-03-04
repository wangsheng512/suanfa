package com.wsheng.suanfa.leecode.ArrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: wsheng
 * @Date: 2019/2/27 22:41
 * @Description:
 */
public class Solution811 {

    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> counts = new HashMap<>() ;

        for(String domain : cpdomains){
            String[] info = domain.split("\\s+") ;
            String[] dom = info[1].split("\\.") ;

            int times = Integer.valueOf(info[0]) ;
            String temp = "" ;
            for(int i = dom.length - 1; i >= 0; i --){
                temp = dom[i] + (i == dom.length - 1? "": ".") + temp ;
                counts.put(temp, counts.getOrDefault(temp, 0) + times) ;
            }
        }
        List<String> result = new ArrayList<String>() ;
        for(String s : counts.keySet()){
            result.add("" + counts.get(s) + " " + s) ;
        }
        return result ;
    }
}
