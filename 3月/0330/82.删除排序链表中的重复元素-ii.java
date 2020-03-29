/*
 * @lc app=leetcode.cn id=82 lang=java
 *
 * [82] 删除排序链表中的重复元素 II
 *
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list-ii/description/
 *
 * algorithms
 * Medium (46.91%)
 * Likes:    243
 * Dislikes: 0
 * Total Accepted:    39K
 * Total Submissions: 83.1K
 * Testcase Example:  '[1,2,3,3,4,4,5]'
 *
 * 给定一个排序链表，删除所有含有重复数字的节点，只保留原始链表中 没有重复出现 的数字。
 * 
 * 示例 1:
 * 
 * 输入: 1->2->3->3->4->4->5
 * 输出: 1->2->5
 * 
 * 
 * 示例 2:
 * 
 * 输入: 1->1->1->2->3
 * 输出: 2->3
 * 三个指针
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {

    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode pred, cur, next;
        pred = cur = head;
        next = cur.next;
        boolean flag = false;
        while (next != null) {
            if (cur.val == next.val) {
                flag = true;
                cur = next;
                next = cur.next;
            } else {
                if (flag) {
                    if (cur.val == head.val) {
                        head = pred =cur= next;
                        next=cur.next;
                    } else {
                        pred.next = next;
                        cur = next;
                        next = cur.next;
                    }
                    flag = false;
                } else {

                    pred = cur;

                    cur = next;
                    next = cur.next;
                }

            }
        }
        if(flag){
            if (cur.val == head.val) {
                head = pred =cur= next;
                // next=cur.next;
            } else {
                pred.next = next;
                cur = next;
                // next = cur.next;
            }
        }
        return head;

    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(1);
        // l1.next.next = new ListNode(1);
        // l1.next.next.next = new ListNode(2);
        // l1.next.next.next.next = new ListNode(3);
        // l1.next.next.next.next.next = new ListNode(4);

        new Solution().deleteDuplicates(l1);
    }
}
// @lc code=end
