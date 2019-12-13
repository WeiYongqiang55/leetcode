/*
 * @Author: your name
 * @Date: 2019-12-12 21:17:34
 * @LastEditTime: 2019-12-12 21:40:19
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings凑头走
 * @FilePath: \leetcode\234.回文链表.java
 */
/*
 * @lc app=leetcode.cn id=234 lang=java
 *
 * [234] 回文链表 
 * 常见思路：从头走到尾，顺便把数字加入到String中，
 * 然后反转string看两个是不是一样
 * 骚操作：
 * 快慢指针，快指针一次走两步，满指针一次走一步，
 * 当快指针走到底的时候，满指针刚好走到中间，
 * 然后前面指针走的时候顺便把前半部分链表反转了，
 * 再从中间比较两个链表
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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)return true;
        ListNode fast = head.next;
        ListNode slow  = head;
        ListNode pre=null,prepre = null;
        while(fast!=null && fast.next!=null){
            //反转链表
            pre = slow;
            slow = slow.next;
            fast = fast.next.next; 

            pre.next = prepre;
            prepre = pre;
        }
        ListNode p2 = slow.next;//后半段链表的头
        slow.next = pre; 
        ListNode p1 = fast==null?slow.next:slow; 
        while(p1!=null){
            if(p1.val != p2.val){
                return false;
            }else{
                p1= p1.next;
                p2= p2.next;
            }
        }
        return true;
    }
}
// @lc code=end

