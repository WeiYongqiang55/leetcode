import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;



/*
 * @Author: your name
 * @Date: 2019-12-10 21:51:23
 * @LastEditTime: 2019-12-11 09:23:52
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \javad:\leetcode\102.二叉树的层次遍历.java
 */
/*
 * @lc app=leetcode.cn id=102 lang=java
 *
 * [102] 二叉树的层次遍历
 *
 * https://leetcode-cn.com/problems/binary-tree-level-order-traversal/description/
 *
 * algorithms
 * Medium (59.91%)
 * Likes:    327
 * Dislikes: 0
 * Total Accepted:    62.3K
 * Total Submissions: 103.9K
 * Testcase Example:  '[3,9,20,null,null,15,7]'
 *
 * 给定一个二叉树，返回其按层次遍历的节点值。 （即逐层地，从左到右访问所有节点）。
 * 
 * 例如:
 * 给定二叉树: [3,9,20,null,null,15,7],
 * 
 * ⁠   3
 * ⁠  / \
 * ⁠ 9  20
 * ⁠   /  \
 * ⁠  15   7
 * 
 * 
 * 返回其层次遍历结果：
 * 
 * [
 * ⁠ [3],
 * ⁠ [9,20],
 * ⁠ [15,7]
 * ]
 * 
 * 
 */

// @lc code=start
/**
 * Definition for a binary tree node. 
 * public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<List<Integer>>();
        if(root == null) return levels;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int level = 0;
        while(!queue.isEmpty()){
            levels.add(new ArrayList<>());
            int cur_level_length = queue.size();
            for (int i = 0;i<cur_level_length;i++){
                TreeNode node = queue.remove();
                levels.get(level).add(node.val);

                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            level++;
        }
        return levels;
         
    }
        
}
// @lc code=end
