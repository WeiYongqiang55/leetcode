/*
 * @lc app=leetcode.cn id=543 lang=java
 *
 * [543] 二叉树的直径
 *
 * https://leetcode-cn.com/problems/diameter-of-binary-tree/description/
 *
 * algorithms
 * Easy (46.70%)
 * Likes:    186
 * Dislikes: 0
 * Total Accepted:    17.5K
 * Total Submissions: 37.5K
 * Testcase Example:  '[1,2,3,4,5]'
 *
 * 给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过根结点。
 * 
 * 示例 :
 * 给定二叉树
 * 
 * 
 * ⁠         1
 * ⁠        / \
 * ⁠       2   3
 * ⁠      / \     
 * ⁠     4   5    
 * 
 * 
 * 返回 3, 它的长度是路径 [4,2,1,3] 或者 [5,2,1,3]。
 * 
 * 注意：两结点之间的路径长度是以它们之间边的数目表示。
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
    int MaxDepth = 0;//最大长度
   
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        dfs(root.left,0);
        int leftMax = MaxDepth;
        MaxDepth =0;
        dfs(root.right,0);
        int rightMax = MaxDepth;
        return leftMax + rightMax;

    }
    public void dfs(TreeNode root,int depth){
        if(root==null){
            if(depth>MaxDepth){
                MaxDepth = depth;
            }
            return ;
        }else{
            depth++;
            dfs(root.left,depth);
            dfs(root.right,depth);
        }

           
    }
}
// @lc code=end

