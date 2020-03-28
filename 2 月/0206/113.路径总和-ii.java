import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=113 lang=java
 *
 * [113] 路径总和 II
 *
 * https://leetcode-cn.com/problems/path-sum-ii/description/
 *
 * algorithms
 * Medium (58.19%)
 * Likes:    158
 * Dislikes: 0
 * Total Accepted:    27.8K
 * Total Submissions: 47.5K
 * Testcase Example:  '[5,4,8,11,null,13,4,7,2,null,null,5,1]\n22'
 *
 * 给定一个二叉树和一个目标和，找到所有从根节点到叶子节点路径总和等于给定目标和的路径。
 * 
 * 说明: 叶子节点是指没有子节点的节点。
 * 
 * 示例:
 * 给定如下二叉树，以及目标和 sum = 22，
 * 
 * ⁠             5
 * ⁠            / \
 * ⁠           4   8
 * ⁠          /   / \
 * ⁠         11  13  4
 * ⁠        /  \    / \
 * ⁠       7    2  5   1
 * 
 * 
 * 返回:
 * 
 * [
 * ⁠  [5,4,11,2],
 * ⁠  [5,8,4,5]
 * ]
 * 
 * 
 */

// @lc code=start

 //Definition for a binary tree node.
  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
 
class Solution {
    static List<List<Integer>> res = new ArrayList<List<Integer>>();

    public static List<List<Integer>> pathSum(TreeNode root, int sum) {
        res.clear();
        if(root==null){
            return res;
        }

        dfs(root, 0, sum, new ArrayList<Integer>());
        return res;
    }

    public static void dfs(TreeNode root, int pathSum, int sum, List<Integer> list) {
        
        if (root.left == null && root.right == null) {
            // 到达叶子节点
            if (pathSum + root.val == sum) {
                // 满足条件
                list.add(root.val);
                res.add(list);
            } else {
                return;
            }
        } else {
            pathSum += root.val;
            list.add(root.val);
            if (root.left != null) {
                dfs(root.left, pathSum, sum, new ArrayList<Integer>(list));
            }
            if (root.right != null) {
                dfs(root.right, pathSum, sum, new ArrayList<Integer>(list));
            }
        }
    }

    // public static void main(String[] args) {
    //     TreeNode root = new TreeNode(5);
    //     root.left = new TreeNode(4);
    //     root.right = new TreeNode(8);
    //     root.left.left = new TreeNode(11);
    //     root.right.left = new TreeNode(13);
    //     root.right.right = new TreeNode(4);
    //     root.left.left.left=new TreeNode(7);
    //     root.left.left.right=new TreeNode(2);
    //     root.right.right.left=new TreeNode(5);
    //     root.right.right.right=new TreeNode(1);
    //     List<List<Integer>> res = pathSum(root, 22);
    // }
}
// @lc code=end

