'''
@Author: your name
@Date: 2019-12-01 13:42:47
@LastEditTime: 2019-12-01 20:28:03
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\19.删除链表的倒数第n个节点.py
'''
#
# @lc app=leetcode.cn id=19 lang=python3
#
# [19] 删除链表的倒数第N个节点
# 双指针，头指针指向头节点，第二个指针指向

# @lc code=start
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None


class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        p = ListNode(-1)
        p.next, a, b = head, p, p
        # 第一个循环，b指针先往前走n步
        while n > 0 and b:
            b, n = b.next, n-1
        # 假设整个链表长5，n是10，那么第一次遍历完后b就等用于空了
        # 于是后面的判断就不用做了，直接返回
        if not b:
            return head
        # 第二次，b指针走到链表最后，a指针也跟着走
        # 当遍历结束时，a指针就指向要删除的节点的前一个位置
        while b.next:
            a, b = a.next, b.next
        # 删除节点并返回
        a.next = a.next.next
        return p.next
# @lc code=end
