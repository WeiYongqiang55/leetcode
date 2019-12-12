/*
 * @Author: your name
 * @Date: 2019-12-12 14:14:55
 * @LastEditTime: 2019-12-12 14:21:13
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcode\141.环形链表.java
 */
/*
 * @lc app=leetcode.cn id=141 lang=java
 *
 * [141] 环形链表 快慢指针，想想一下，在一个环形的跑道上，
 * 两个运动员一快一慢，最终快的那个运动员会追上慢的那个
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head== null || head.next == null){
            return false;
        }
        ListNode slow  = head;
        ListNode fast = head.next;
        
        while(slow != fast){
            if(fast == null || fast.next==null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
// @lc code=end

