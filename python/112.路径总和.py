'''
@Author: your name
@Date: 2019-12-11 17:09:57
@LastEditTime: 2019-12-11 17:51:19
@LastEditors: Please set LastEditors
@Description: In User Settings Edit
@FilePath: \leetcode\112.路径总和.py
'''
#
# @lc app=leetcode.cn id=112 lang=python3
#
# [112] 路径总和
#

# @lc code=start
# Definition for a binary tree node.
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution:
  
    def hasPathSum(self, root: TreeNode, sum: int) -> bool:
        if root == None:
            return []
        res=[]
        path = []
        self.dfs(root,path,sum,res,root.val)
        print(res)
        if len(res)>0:
            return True
        else:
            return False

    def dfs(self,root,path,sum,res,count):
        if sum ==count and root.left == None and root.right == None:
            res.append(path)
            print(path)
            return True
        # elif sum<0: ##这里还有他妈的负数呢
        #     return False
        if root== None:
            return false
        
        if root.left != None:
            path.append(root.left.val)
            self.dfs(root.left,path,sum,res,count+root.left.val)
            path.pop()
        if root.right != None:
            self.dfs(root.right,path,sum,res,count+ root.right.val)


a = Solution()
root = TreeNode(-2)
root.left = None
root.right = TreeNode(-3)
# root.left.right = TreeNode(5)
# root.right.left = TreeNode(6)
# root.right.right = TreeNode(7)

print(a.hasPathSum(root,-5))
# @lc code=end

