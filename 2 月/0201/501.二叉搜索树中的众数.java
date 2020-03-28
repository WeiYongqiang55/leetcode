import java.util.ArrayList;
import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=501 lang=java
 *
 * [501] 二叉搜索树中的众数
 *
 * https://leetcode-cn.com/problems/find-mode-in-binary-search-tree/description/
 *
 * algorithms
 * Easy (43.53%)
 * Likes:    75
 * Dislikes: 0
 * Total Accepted:    8K
 * Total Submissions: 18.3K
 * Testcase Example:  '[1,null,2,2]'
 *
 * 给定一个有相同值的二叉搜索树（BST），找出 BST 中的所有众数（出现频率最高的元素）。
 * 
 * 假定 BST 有如下定义：
 * 
 * 
 * 结点左子树中所含结点的值小于等于当前结点的值
 * 结点右子树中所含结点的值大于等于当前结点的值
 * 左子树和右子树都是二叉搜索树
 * 
 * 
 * 例如：
 * 给定 BST [1,null,2,2],
 * 
 * ⁠  1
 * ⁠   \
 * ⁠    2
 * ⁠   /
 * ⁠  2
 * 
 * 
 * 返回[2].
 * 
 * 提示：如果众数超过1个，不需考虑输出顺序
 * 
 * 进阶：你可以不使用额外的空间吗？（假设由递归产生的隐式调用栈的开销不被计算在内）
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
    HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

    public int[] findMode(final TreeNode root) {
        bfs(root);
        int maxShow =1;
        final ArrayList<Integer> res = new ArrayList<>();
        for(final Integer key:map.keySet()){
            if(maxShow<map.get(key)){
                res.clear();
                res.add(key);
                maxShow=map.get(key);
            }else if(maxShow==map.get(key)){
                res.add(key);
            }
        }
        return res.stream().mapToInt(i->i).toArray();
    }
    public void bfs(final TreeNode root){
        if(root==null){
            return ;
        }
        if(map.containsKey(root.val)){
            map.put(root.val,map.get(root.val)+1);
        }else{
            map.put(root.val,1);
        }
        bfs(root.left);
        bfs(root.right);
    }
}
// @lc code=end

