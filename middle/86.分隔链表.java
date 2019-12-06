/*
 * @Author: your name
 * @Date: 2019-12-06 11:51:55
 * @LastEditTime: 2019-12-06 17:42:47
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \javad:\leetcode\86.分隔链表.java
 */
/*
 * @lc app=leetcode.cn id=86 lang=java
 *
 * [86] 分隔链表
 * 
 * 给定一个链表和一个特定值 x，对链表进行分隔，
 * 使得所有小于 x 的节点都在大于或等于 x 的节点之前。

你应当保留两个分区中每个节点的初始相对位置。

示例:

输入: head = 1->4->3->2->5->2, x = 3
输出: 1->2->2->4->3->5
 */
// 解题思路1 三个指针 思路2 左右两个链表 

// @lc code=start

//   Definition for singly-linked list.
// class ListNode {
//     int val;
//     ListNode next;
//     ListNode(int x) { val = x; }
// }

class Solution {
    public static ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null){
            return head;
        }
        // 第一步找到小于x的节点
        ListNode p = new ListNode(0);
        ListNode s = new ListNode(0);
        // ListNode t = new ListNode(0);
        ListNode res = new ListNode(0);
      
        p.next = null;
        s.next = head;
        res = s;
        // t = head;//用head 代替t
        while (head != null && head.val < x ) {
            s = head;
            head = head.next;
        }
        if (head == null){
            //全都小于
            return res.next;
        }
        p = s;
        while (head != null) {
            if (head.val >= x) {
                s=head;
                head = head.next;
            } else {
                s.next = head.next;
                head.next = p.next;
                p.next = head;

                p = head;
                head = s.next;
            }
        }
        return res.next;

    }

    // public static void main(String[] args) {
    //     ListNode head = new ListNode(2);
    //     head.next = new ListNode(1);
    //     // head.next.next = null;
    //     // head.next.next = new ListNode(3);
    //     // head.next.next.next = new ListNode(2);
    //     // head.next.next.next.next = new ListNode(5);
    //     // head.next.next.next.next.next = new ListNode(2);
    //     // head.next.next.next.next.next.next = null;
    //     int x = 2;
    //     partition(head, x);
    //     // return res;
    //     // System.out.println(res);
    // }
    
}
// @lc code=end

