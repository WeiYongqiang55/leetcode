'''
@Author: your name
@Date: 2019-11-29 14:05:07
@LastEditTime: 2019-11-29 20:02:41
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\2.两数相加.py
'''
#
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

class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        head = ListNode(0) #这里必须要有值,不然汇报错的
        result = head
        carry =0 
 
        while l1 or l2:
            x = l1.val if l1 else 0
            y = l2.val if l2 else 0
            sum = (x + y + carry) % 10  #
            carry = (x + y + carry) // 10 #进位
            head.next = ListNode(sum)
            head = head.next
            if l1: l1 = l1.next
            if l2: l2 = l2.next
        
        if carry:
            head.next = ListNode(1)
        return result.next
         
# @lc code=end

