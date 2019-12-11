import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
 * @Author: your name
 * @Date: 2019-12-06 10:21:01
 * @LastEditTime: 2019-12-06 11:32:55
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * 
 * @FilePath: \javad:\leetcode\77.组合.java
 */
/*
 * @lc app=leetcode.cn id=77 lang=java
 *
 * [77] 组合
 * 使用回溯法，从1开始选取，约束条件：
 * 开始的数字逐渐递增，并且后选的数字必须比上一层的大，
 */

// @lc code=start
class Solution {
    private List<List<Integer>> res = new ArrayList<>();

    private void findCombinations(int n, int k, int begin, Stack<Integer> pre) {
        if (pre.size() == k) {
            // 够数了，就添加到结果集中
            res.add(new ArrayList<>(pre));
            return;
        }
        // 关键在于分析出 i 的上界
        for (int i = begin; i <= n; i++) {
            pre.add(i);//选择i
            findCombinations(n, k, i + 1, pre);
            pre.pop();//不选i
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        // 特判
        if (n <= 0 || k <= 0 || n < k) {
            return res;
        }
        // 从 1 开始是题目的设定
        findCombinations(n, k, 1, new Stack<>());
        return res;
    }

    // public static void main(String[] args) {
    //     Solution solution = new Solution();
    //     List<List<Integer>> combine = solution.combine(4, 2);
    //     System.out.println(combine);
    // }
}
// @lc code=end

