/*
 * @Author: your name
 * @Date: 2019-12-09 16:17:22
 * @LastEditTime: 2019-12-09 16:30:37
 * @LastEditors: Please set LastEditors
 * @LastEditTime: 2019-12-09 16:30:14t
 * @LastEditors: Please set LastEditors序链表.java
 */
/*
 * @lc app=leetcode.cn id=21 lang=java
 *
 * [21] 合并两个有序链表
 */

// @lc code=start

//Definition for singly-linked list.
// class ListNode {
//     int val;
//     ListNode next;
//     ListNode(int x) { val = x; }
// }
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode prehead = new ListNode(0);
        ListNode pre = prehead;
        while(l1 != null && l2 !=null){
            if(l1.val <= l2.val){
                pre.next = l1;
                l1 = l1.next;
            }
            else{
                pre.next = l2;
                l2 = l2.next;
            }
            pre = pre.next;
        }
        pre.next = l1 ==null ? l2 : l1;
        
        return prehead.next;
    }
}
// @lc code=end

