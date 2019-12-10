/*
 * @Author: your name
 * @Date: 2019-12-08 18:54:52
 * @LastEditTime: 2019-12-09 10:24:12
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Editot
 * @FilePath: \javad:\leetcode\98.验证二叉搜索树.java
 */
/*
 * @lc app=leetcode.cn id=98 lang=java
 *
 * [98] 验证二叉搜索树
 * 这里有一个上下界的问题，比如
 *         10
 *       5    15
 *           6   20
 * 这个树的6不但要小于15还要大于10才行
 * 
 */

// @lc code=start

 // Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
 
class Solution {
    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }
    public boolean helper(TreeNode node, Integer lower,Integer upper){
        if(node == null){
            return true;
        }

        int val = node.val;
        if (lower != null && val <= lower) return false;
        if (upper != null && val >= upper) return false;
    
        if (! helper(node.right, val, upper)) return false;
        if (! helper(node.left, lower, val)) return false;
        return true;
    }
    public static void main(String[] args) {
        TreeNode head = new TreeNode(10);
        head.left = new TreeNode(5);
        head.right = new TreeNode(15);
        head.right.left = new TreeNode(6);
        head.right.right = new TreeNode(20);
        Solution a = new Solution();
        System.out.print(a.isValidBST(head));
    }
}
// @lc code=end

