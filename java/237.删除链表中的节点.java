/*
 * @Author: your name
 * @Date: 2019-12-12 22:21:58
 * @LastEditTime: 2019-12-13 10:09:39
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Editval = 
 * @FilePath: \leetcode\237.删除链表中的节点.java
 */
/*
 * @lc app=leetcode.cn id=237 lang=java
 *
 * [237] 删除链表中的节点
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
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
// @lc code=end

