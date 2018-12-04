package com.wsheng.suanfa.leecode;

import java.util.LinkedList;
import java.util.List;

/**
 * /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Solution203 {

    class ListNode{
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    //没有使用虚拟头结点。
    public static ListNode removeElements(ListNode head, int val) {
       while (head != null && head.val == val){
            head = head.next;
       }
       if (head == null)
           return null;
       ListNode prev = head;
       while (prev.next != null){
           if (prev.next.val == val){
               ListNode delNode = prev.next.next;
           }
           else
                prev = prev.next;
       }
       return head;
    }

    //使用虚拟头结点
    public ListNode removeElements2ListNode (ListNode head, int val){

        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode prev = dummyHead;
        while (prev.next != null){
            if (prev.next.val == val){
                prev.next = prev.next.next;
            }
            else
                prev = prev.next;
        }
        return dummyHead.next;
    }

    //递归
    public ListNode removeElements3 (ListNode head, int val){
        if (head == null)
            return null;
        head.next = removeElements3(head.next,val);
            return head.val == val ? head.next : head;
    }


}
