'''
@Author: your name
@Date: 2019-12-01 20:29:02
@LastEditTime: 2019-12-01 21:19:37
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\24.两两交换链表中的节点.py
'''
#
# @lc app=leetcode.cn id=24 lang=python3
#
# [24] 两两交换链表中的节点
# 用三个指针 逆转链表
# O->1->2->3->4 
# v  s  t
# s.next = t.next
# t.next = s
# v.next = t
# ***********************
# O->2->1->3->4 
# v  t  s
# ***********************
# v = s
# s = s.next 
# t = s.next 


# @lc code=start
# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def swapPairs(self, head: ListNode) -> ListNode:
        if not head:
            return head

        vhead = ListNode(0)
        vhead.next = head
        tail = vhead
        p1 = tail.next
        p2 = tail.next.next
        while p1 and p2:
            p1.next = p2.next
            p2.next = p1 
            tail.next = p2
            tail = p1
            
            p1 = p1.next
            # p1 为none,链表已经到头了
            if not p1:
                break
            
            p2 = p1.next
        return vhead.next

def printListNode(head):
    while head:
        print(head.val)
        head=head.next

head = ListNode(1)
head.next = ListNode(2)
head.next.next = ListNode(3)
head.next.next.next = ListNode(4)
a=Solution()
printListNode(a.swapPairs(head))
# @lc code=end

