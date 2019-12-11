/*
 * @Author: your name
 * @Date: 2019-12-11 16:46:38
 * @LastEditTime: 2019-12-11 17:14:05
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \leetcode\111.二叉树的最小深度.java
 */
/*
 * @lc app=leetcode.cn id=111 lang=java
 *
 * [111] 二叉树的最小深度
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int minDepth(TreeNode root) {
        return depth(root);
    }
    public int depth(TreeNode root){
        if (root == null)
        {
            return 0;
        }

        int left = depth(root.left);
        int right = depth(root.right);
        if(left >0 && right ==0){
            return left+1;
        }
        else if(left ==0  && right >0){
            return right +1;
        }else{
            return 1+Math.min(left,right);
        }
    }
}
// @lc code=end

