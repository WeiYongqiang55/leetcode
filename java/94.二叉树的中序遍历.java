/*
 * @lc app=leetcode.cn id=94 lang=java
 *
 * [94] 二叉树的中序遍历
 *
 * https://leetcode-cn.com/problems/binary-tree-inorder-traversal/description/
 *
 * algorithms
 * Medium (69.12%)
 * Likes:    337
 * Dislikes: 0
 * Total Accepted:    82.1K
 * Total Submissions: 118.7K
 * Testcase Example:  '[1,null,2,3]'
 *
 * 给定一个二叉树，返回它的中序 遍历。
 * 中序便利，访问是 左子树 根结点 右子树
 * 前序便利 访问是  根结点 左子树 右子树
 * 后序便利 访问是 左子树 右子树 根结点
 * 
 * 示例:
 * 
 * 输入: [1,null,2,3] 是前序便利，所以这道题是如何把前序便利转成中序便利
 * ⁠  1
 * ⁠   \
 * ⁠    2
 * ⁠   /
 * ⁠  3
 * 
 * 输出: [1,3,2]
 * 
 * 进阶: 递归算法很简单，
 * 你可以通过迭代算法完成吗？
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
// 递归解法
// class Solution {
//     public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer> res = new ArrayList<>();
//         backreack(root, res);
//         return  res;
//     }
//     //递归解法
//     public void backreack(TreeNode root,List<Integer> res){
//         if (root != null){
//             if (root.left != null){
//                 backreack(root.left,res);
//             }
//             res.add(root.val);
//             if (root.right != null){
//                 backreack(root.right,res);
//             }
//         }
//     }
// }

// 盏迭代方法
class Solution {
    class colorNode {
        TreeNode node;
        String color;

        public colorNode(TreeNode node,String color){
            this.node = node;
            this.color = color;
        }
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null){
            return res;
        }
        Stack<colorNode> stack = new Stack<>();
        stack.push(new colorNode(root,"white"));

        while(!stack.empty()){
            colorNode cn = stack.pop();
            if (cn.color.equals("white")){
                if(cn.node.right !=null){
                    // 右子树不为空
                    stack.push(new colorNode(cn.node.right,"white"));
                }
                stack.push(new colorNode(cn.node,"gray"));
                if(cn.node.left != null){
                    stack.push(new colorNode(cn.node.left,"white"));
                }

            }else{
                res.add(cn.node.val);
            }
        }
        return res;
    }
}
// @lc code=end

