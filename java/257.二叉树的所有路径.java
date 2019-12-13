import java.util.ArrayList;
import java.util.List;
/*
 * @Author: your name
 * @Date: 2019-12-13 10:40:19
 * @LastEditTime: 2019-12-13 11:18:47
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Editlic 
 * @FilePath: \leetcode\257.二叉树的所有路径.java
 */
/*
 * @lc app=leetcode.cn id=257 lang=java
 *
 * [257] 二叉树的所有路径  递归
 */

// @lc code=start

// efinition for a binary tree node.
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}

class Solution {
    List<String> res;
    ArrayList<Integer> path;
    public List<String> binaryTreePaths(TreeNode root) {
        res = new ArrayList<String>(); 
        dfs(root,"",res);
        return res;
    }
    public void dfs(TreeNode root,String path, List<String> res2) {
        if (root == null) {
            return;
        } else {
            path += Integer.toString(root.val);
            if (root.left == null && root.right == null) {
                res2.add(path);// 叶子节点
                return ;
            }else{
                //不是叶子节点
                path += "->";
                dfs(root.left,path,res);
                dfs(root.right,path,res);
            } 
        } 
    }
    // public String format(ArrayList<Integer> path){
    //     StringBuilder builder  = new StringBuilder();
    // }
    public static void main(String[] args) {
        Solution a = new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        a.binaryTreePaths(root);
    }
}
// @lc code=end

