/*
 * @Author: your name
 * @Date: 2020-01-29 13:10:21
 * @LastEditTime : 2020-01-29 14:38:27
 * @LastEditors  : Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: /leetcode/404.左叶子之和.java
 */
/*
 * @lc app=leetcode.cn id=404 lang=java
 *
 * [404] 左叶子之和
 *
 * https://leetcode-cn.com/problems/sum-of-left-leaves/description/
 *
 * algorithms
 * Easy (52.80%)
 * Likes:    116
 * Dislikes: 0
 * Total Accepted:    15.3K
 * Total Submissions: 28.8K
 * Testcase Example:  '[3,9,20,null,null,15,7]'
 *
 * 计算给定二叉树的所有左叶子之和。
 * 
 * 示例：
 * 
 * 
 * ⁠   3
 * ⁠  / \
 * ⁠ 9  20
 * ⁠   /  \
 * ⁠  15   7
 * 
 * 在这个二叉树中，有两个左叶子，分别是 9 和 15，所以返回 24
 * 
 * 
 * 
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    int sum = 0;

    public void getsum(TreeNode root, boolean isleft) {
        if (root != null) {
            if (isleft && root.left == null && root.right == null) {
                sum += root.val;
            } else {
                getsum(root.left, true);
                getsum(root.right, false);
            }
        } else {
            return;
        }
    }

    public int sumOfLeftLeaves(TreeNode root) {
        getsum(root, false);
        return sum;
    }

}
// @lc code=end
