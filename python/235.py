# Definition for a binary tree node.
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution:
    def build_tree(self,root,nums):
        next_lev=[root]
        for i in range(0,len(nums)-1,2):
            nodel = TreeNode(nums[i])
            ndoer = TreeNode(nums[i+1])
            root=next_lev.pop(0)
            root.left=nodel
            root.right=ndoer
            next_lev.append(nodel)
            next_lev.append(ndoer)
            
            
        # def print_tree(self,root):

#  todo    
    def lowestCommonAncestor(self, root, p, q):
        """
        :type root: TreeNode
        :type p: TreeNode
        :type q: TreeNode
        :rtype: TreeNode
        """

if __name__ == "__main__":
    so = Solution()
    root = TreeNode(6)
    nums=[6,2,8,0,4,7,9,None,None,3,5]
    so.build_tree(root,nums[1:])