import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=199 lang=java
 *
 * [199] 二叉树的右视图
 *
 * https://leetcode-cn.com/problems/binary-tree-right-side-view/description/
 *
 * algorithms
 * Medium (62.66%)
 * Likes:    127
 * Dislikes: 0
 * Total Accepted:    16.6K
 * Total Submissions: 26.3K
 * Testcase Example:  '[1,2,3,null,5,null,4]'
 *
 * 给定一棵二叉树，想象自己站在它的右侧，按照从顶部到底部的顺序，返回从右侧所能看到的节点值。
 * 
 * 示例:
 * 
 * 输入: [1,2,3,null,5,null,4]
 * 输出: [1, 3, 4]
 * 解释:
 * 
 * ⁠  1            <---
 * ⁠/   \
 * 2     3         <---
 * ⁠\     \
 * ⁠ 5     4       <---
 * 
 * 
 */

// @lc code=start

//   Definition for a binary tree node.
  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
 
class Solution {
     int maxDepth = -1;
     List<Integer> res ;
    public List<Integer> rightSideView(TreeNode root) {
        res = new ArrayList<>();
        if(root==null){
            return res;
        }
        dfs(root, 0);
        return res;
    }

    public  void dfs(TreeNode root, int curDepth) {

        if (root == null) {
            return;
        }
        if (curDepth > maxDepth) {
            System.out.println(root.val+" ");
            res.add(root.val);
            maxDepth = curDepth;
        }
        dfs(root.right,curDepth+1);
        dfs(root.left,curDepth+1);
        
    }
    // public static void main(String[] args) {
    //     TreeNode root = new TreeNode(1);
    //     // root.right=new TreeNode(3);
    //     // root.right.right=new TreeNode(4);
    //     // root.left=new TreeNode(2);
    //     // root.left.right=new TreeNode(5);
    //     rightSideView(root);
    // }
}

// @lc code=end

