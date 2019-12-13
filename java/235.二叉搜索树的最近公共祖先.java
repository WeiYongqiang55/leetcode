/*
 * @Author: your name
 * @Date: 2019-12-12 21:48:44
 * @LastEditTime: 2019-12-12 22:21:34
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings EditVal 
 * @FilePath: \leetcode\235.二叉搜索树的最近公共祖先.java
 */
/*
 * @lc app=leetcode.cn id=235 lang=java
 *
 * [235] 二叉搜索树的最近公共祖先
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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //递归解法
        // int parentVal = root.val;
        // int pval= p.val;
        // int qval = q.val;

        // if(pval >parentVal && qval >parentVal){
        //     //右子树
        //     return lowestCommonAncestor(root.right, p, q);
        // }else if(pval <parentVal && qval<parentVal){
        //     return lowestCommonAncestor(root.left, p, q);
        // }else{
        //     return root;
        // }
        //迭代解法
        int pval = p.val;
        int qval = q.val;
        
        while(root != null){
            int parentVal = root.val;
                        
            if(pval >parentVal && qval >parentVal){
            //右子树
                root = root.right;
            }else if(pval <parentVal && qval<parentVal){
                root = root.left;
            }else{
                return root;
            }
        }
        return root;
    }
}
// @lc code=end

