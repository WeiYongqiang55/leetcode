'''
@Author: your name
@Date: 2019-11-28 22:32:21
@LastEditTime: 2019-11-28 22:44:43
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\437.路径总和-iii.py
'''
#
# @lc app=leetcode.cn id=437 lang=python3
#
# [437] 路径总和 III
#没有思路,下次在做

# @lc code=start
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def pathSum(self, root, sum):
        self.data=[]
        self.count=0
        
        def recursive(root,sum):
            if not root:
                return 
            self.data.append(root.val)
            cur=0
            for i in range(len(self.data)-1,-1,-1):
                cur+=self.data[i]
                if cur==sum:
                    self.count+=1
            recursive(root.left,sum)
            recursive(root.right,sum)
            self.data.pop()

        
        recursive(root,sum)
        return self.count
        
# @lc code=end

