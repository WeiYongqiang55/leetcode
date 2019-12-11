/*
 * @Author: your name
 * @Date: 2019-12-10 21:01:24
 * @LastEditTime: 2019-12-10 21:12:17
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edi
 * @FilePath: \javad:\leetcode\83.删除排序链表中的重复元素.java
 */
/*
 * @lc app=leetcode.cn id=83 lang=java
 *
 * [83] 删除排序链表中的重复元素 
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode start = head;
        ListNode res = head;
        ListNode end = head.next;
        
        while(end != null){
            if(start.val == end.val){
                end = end.next;
            }else{
                start.next = end;
                start = end;
                end = end.next;
            }
        }
        start.next = end; //处理最后一个数字
        return res;
    }
}
// @lc code=end

