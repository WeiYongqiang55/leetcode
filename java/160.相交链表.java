/*
 * @Author: your name
 * @Date: 2019-12-12 14:22:14
 * @LastEditTime: 2019-12-12 14:30:53
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcode\160.相交链表.java
 */
/*
 * @lc app=leetcode.cn id=160 lang=java
 *
 * [160] 相交链表  双指针
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA== null || headB==null){
            return null;
        }
        ListNode pa = headA,pb = headB;
        while(pa != pb){
            pa = pa==null?headB:pa.next;
            pb = pb==null?headA:pb.next;
        }
        return pa;
    }
}
// @lc code=end

