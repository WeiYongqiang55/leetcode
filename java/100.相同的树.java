/*
 * @Author: your name
 * @Date: 2019-12-10 21:12:24
 * @LastEditTime: 2019-12-10 21:36:08
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \javad:\leetcode\100.相同的树.java
 */
/*
 * @lc app=leetcode.cn id=100 lang=java
 *
 * [100] 相同的树 递归
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
    //递归
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p== null  && q== null){//两个都是空
            return true;
        }
        if(q == null || p == null){//只有一个是空的
            return false;
        }
        if(p.val != q.val){
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
    
}
// @lc code=end

