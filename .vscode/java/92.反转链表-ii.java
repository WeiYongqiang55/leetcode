/*
 * @lc app=leetcode.cn id=92 lang=java
 *
 * [92] 反转链表 II
 *
 * https://leetcode-cn.com/problems/reverse-linked-list-ii/description/
 *
 * algorithms
 * Medium (48.09%)
 * Likes:    259
 * Dislikes: 0
 * Total Accepted:    27.1K
 * Total Submissions: 56.3K
 * Testcase Example:  '[1,2,3,4,5]\n2\n4'
 *
 * 反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。
 * 
 * 说明:
 * 1 ≤ m ≤ n ≤ 链表长度。
 * 
 * 示例:
 * 
 * 输入: 1->2->3->4->5->NULL, m = 2, n = 4
 * 输出: 1->4->3->2->5->NULL
 * 
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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null){
            return null;
        }

        
        ListNode cur= head;
        ListNode prev = new ListNode(0);
        prev.next = head;
        ListNode res = new ListNode(0);
        res = prev;
        //移动指针到m位置
        while(m>1){
            prev = cur;
            cur = cur.next;
            m--;
            n--;
        }
        ListNode con = prev;
        ListNode tail = cur;

        ListNode temp = null;
        while(n>0){
            //循环逆转指针
            temp = cur.next;
            cur.next = prev;

            prev = cur;
            cur = temp;
            n--;
        }

        con.next = prev;
        tail.next = cur;

        return res.next;
    }
}
// @lc code=end

