'''
@Author: your name
@Date: 2019-11-28 20:06:53
@LastEditTime: 2019-11-28 20:43:04
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\206.反转链表.py
'''
#
# @lc app=leetcode.cn id=206 lang=python3
#
# [206] 反转链表
#

# @lc code=start
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if not head :
            return 
        first = head
        target = first.next
        while target:
            first.next = target.next
            target.next = head
            head = target 
            target = first.next
        return head
# @lc code=end

