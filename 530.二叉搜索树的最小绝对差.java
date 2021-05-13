import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=530 lang=java
 *
 * [530] 二叉搜索树的最小绝对差
 *
 * https://leetcode-cn.com/problems/minimum-absolute-difference-in-bst/description/
 *
 * algorithms
 * Easy (55.07%)
 * Likes:    85
 * Dislikes: 0
 * Total Accepted:    8.9K
 * Total Submissions: 16.2K
 * Testcase Example:  '[1,null,3,2]'
 *
 * 给定一个所有节点为非负值的二叉搜索树，求树中任意两节点的差的绝对值的最小值。
 * 
 * 示例 :
 * 
 * 
 * 输入:
 * 
 * ⁠  1
 * ⁠   \
 * ⁠    3
 * ⁠   /
 * ⁠  2
 * 
 * 输出:
 * 1
 * 
 * 解释:
 * 最小绝对差为1，其中 2 和 1 的差的绝对值为 1（或者 2 和 3）。
 * 
 * 
 * 注意: 树中至少有2个节点。
 * 
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
    ArrayList<Integer> list = new ArrayList<Integer>();
    int minMinus= Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        bfs(root);
        return minMinus;
    }
    public void bfs(TreeNode root){
        if(root!=null){
            
            for(int i=0;i<list.size();i++){
                if(Math.abs(root.val-list.get(i))<minMinus){
                    minMinus=Math.abs(root.val-list.get(i));
                }
            }
            list.add(root.val);
            bfs(root.left);
            bfs(root.right);
        }
    }
    
}
// @lc code=end

