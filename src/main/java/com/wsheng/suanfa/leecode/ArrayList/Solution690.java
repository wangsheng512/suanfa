package com.wsheng.suanfa.leecode.ArrayList;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;

/**
 * @Auther: wsheng
 * @Date: 2019/1/27 21:24
 * @Description:
 */
public class Solution690 {

    class Employee {
        // It's the unique id of each node
        // unique id of this employee
        public int id;
        // the importance value of this employee
        public int importance;
        // the id of direct subordinates
        public List<Integer> subordinates;
    }

    public int getImportance(List<Employee> employees, int id) {
        Employee emp=null;
        int sum=0;   //重要度
        HashMap<Integer,Employee> map=new HashMap<>();  //存储员工信息
        for(Employee e:employees) {
            map.put(e.id, e);
        }
        //广度优先遍历员工
        ArrayDeque<Employee> queue=new ArrayDeque<>();
        queue.addLast(map.get(id));
        while(!queue.isEmpty()) {
            emp=queue.removeFirst();
            sum+=emp.importance;
            for(int i:emp.subordinates) {
                queue.addLast(map.get(i));
            }
        }
        return sum;
    }
}
