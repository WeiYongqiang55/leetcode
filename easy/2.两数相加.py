'''
@Author: weiyq
@Date: 2019-11-24 19:17:34
@LastEditTime: 2019-11-24 19:46:06
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\2.两数相加.py
'''

# @lc app=leetcode.cn id=2 lang=python3
#
# [2] 两数相加
#

# @lc code=start
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None
#这题不会做
#要考虑到 
# 1： 两个链表不一样长的情况
# 2： 当一个列表为空时
# 3： 求和运算最后有额外的进位
class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        carry =0
        root = n = ListNode(0)
        while l1 or l2 or carry: #如果l1或者l2 或者两个书的和的进位不为0 
            v1 = v2 = 0
            if l1:
                v1 = l1.val
                l1 = l1.next
            if l2:
                v2 = l2.val
                l2 = l2.next
            carry, val = divmod(v1+v2+carry, 10)
            n.next = ListNode(val)
            n = n.next()
        return root.next

# @lc code=end

