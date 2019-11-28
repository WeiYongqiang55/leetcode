'''
@Author: your name
@Date: 2019-11-28 19:42:53
@LastEditTime: 2019-11-28 20:06:40
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\203.移除链表元素.py
'''
#
# @lc app=leetcode.cn id=203 lang=python3
#
# [203] 移除链表元素
#

# @lc code=start
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None
#两个指针，
#  解题思路：新建一个节点指针start，
# 节点的next指向头结点head,
# 另一个next指针指向head指针指向的节点，
# 依次循环判断，next指针的val是不是要找的值，
# 如果是start.next = next.next   next = next.next
class Solution:
    def removeElements(self, head: ListNode, val: int) -> ListNode:
        start = ListNode(0) #主要是为了防止 head指向的就是要删除的，那删除了就没头指针了
        start.next = head
        result = start #这里保存好在最后的时候返回
        next = head
        while start.next:
            if next.val == val:
                start.next = next.next
                next = next.next
            else:
                start = next
                next = next.next
        return result.next
# @lc code=end

