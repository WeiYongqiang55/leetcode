'''
@Author: your name
@Date: 2019-11-27 17:23:40
@LastEditTime: 2019-11-27 17:49:56
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\104.二叉树的最大深度.py
'''
#
# @lc app=leetcode.cn id=104 lang=python3
#
# [104] 二叉树的最大深度
#递归 

# @lc code=start
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def maxDepth(self, root: TreeNode):
        if root == None :#结束递归的条件
            return 0
        else:
            left_height  = self.maxDepth(root.left)
            right_height = self.maxDepth(root.right)
            return max(left_height,right_height)+1


# @lc code=end

