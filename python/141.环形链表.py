'''
@Author: your name
@Date: 2019-12-11 19:24:21
@LastEditTime: 2019-12-12 14:14:30
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\141.环形链表.py
'''
#
# @lc app=leetcode.cn id=141 lang=python3
#
# [141] 环形链表
#想象一下，两名运动员以不同的速度在环形赛道上跑步会发生什么？

# @lc code=start
# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def hasCycle(self, head: ListNode) -> bool:
        if(head== None or head.next == None):
            return False
        slow = head
        fast = head.next
        
        while slow != fast:
            if fast==None or fast.next == None:
                return False
            slow = slow.next
            fast = fast.next.next
        return True

a = Solution()
root = ListNode(3)
a.hasCycle(root)
# @lc code=end

