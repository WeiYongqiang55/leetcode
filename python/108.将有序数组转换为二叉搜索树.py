'''
@Author: your name
@Date: 2019-12-11 15:52:35
@LastEditTime: 2019-12-11 16:06:37
@LastEditors: Please set LastEditors
@Description: In User Settings Edi
@FilePath: \javad:\leetcode\108.将有序数组转换为二叉搜索树.py
'''
#
# @lc app=leetcode.cn id=108 lang=python3
#
# [108] 将有序数组转换为二叉搜索树
#
# https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree/description/
#
# algorithms
# Easy (67.93%)
# Likes:    276
# Dislikes: 0
# Total Accepted:    39.7K
# Total Submissions: 58.3K
# Testcase Example:  '[-10,-3,0,5,9]'
#
# 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
# 
# 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
# 
# 示例:
# 
# 给定有序数组: [-10,-3,0,5,9],
# 
# 一个可能的答案是：[0,-3,9,-10,null,5]，它可以表示下面这个高度平衡二叉搜索树：
# 
# ⁠     0
# ⁠    / \
# ⁠  -3   9
# ⁠  /   /
# ⁠-10  5
# 
# 
#

# @lc code=start
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def sortedArrayToBST(self, nums: List[int]) -> TreeNode:
        if nums:
            m = len(nums) // 2
            root = TreeNode(nums[m])
            root.left = self.sortedArrayToBST(nums[:m])
            root.right = self.sortedArrayToBST(nums[m+1:])
            return root





# @lc code=end

