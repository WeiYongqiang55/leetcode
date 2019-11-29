'''
@Author: your name
@Date: 2019-11-28 20:51:32
@LastEditTime: 2019-11-28 21:02:33
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\226.翻转二叉树.py
'''
#
# @lc app=leetcode.cn id=226 lang=python3
#
# [226] 翻转二叉树
#

# @lc code=start
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None
#递归 
class Solution:
    def invertTree(self, root: TreeNode) -> TreeNode:
        if not root:
            return root
        root.left, root.right = root.right, root.left
        self.invertTree(root.left)
        self.invertTree(root.right)
        return root #这里其实还是返回的最一开始的oroot 
        
        
        #官方题解
        # if root == None:
        #     return root
        # tmp = root.left
        # root.left = self.invertTree(root.right)
        # root.right = self.invertTree(tmp)
        # return root

# @lc code=end

