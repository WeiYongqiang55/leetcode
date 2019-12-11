'''
@Author: your name
@Date: 2019-12-11 16:47:17
@LastEditTime: 2019-12-11 17:09:21
@LastEditors: Please set LastEditors
@Description: In User Settings 
@FilePath: \leetcode\111.二叉树的最小深度.py
'''
#
# @lc app=leetcode.cn id=111 lang=python3
#
# [111] 二叉树的最小深度
#

# @lc code=start
# Definition for a binary tree node.
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None
##dfs
class Solution:
    def minDepth(self, root: TreeNode) -> int:
        return self.depth(root)
    def depth(self,root):
        if root == None:
            return 0
        
        left = self.depth(root.left)
        right = self.depth(root.right)
        if left>0 and right ==0:
            return 1+left
        elif left==0 and right>0:
            return 1+right
        else:
            return 1+min(left,right)
        
a = Solution()
root = TreeNode(1)
root.right = TreeNode(2)
print(a.minDepth(root))
# @lc code=end

