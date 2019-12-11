/*
 * @Author: your name
 * @Date: 2019-12-11 16:32:10
 * @LastEditTime: 2019-12-11 16:41:16
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Editvod
 * @FilePath: \javad:\leetcode\110.平衡二叉树.java
 */
/*
 * @lc app=leetcode.cn id=110 lang=java
 *
 * [110] 平衡二叉树
 */

// @lc code=start

//   Definition for a binary tree node.
// class TreeNode {
//       int val;
//       TreeNode left;
//       TreeNode right;
//       TreeNode(int x) { val = x; }
// }
 
class Solution {
    public boolean isBalanced(TreeNode root) {
        return depth(root) != -1;
    }
    public int depth(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = depth(root.left);
        int right = depth(root.right);
        if(left == -1) return -1;
        if(right ==-1) return -1;
        if(Math.abs(left-right)>=2){
            return -1;
        }else{
            return Math.max(left,right)+1;
        }
    }

    public static void main(String[] args) {
        Solution a  = new Solution();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        boolean res = a.isBalanced(root);
        System.out.println(res);
    }
}
// @lc code=end

